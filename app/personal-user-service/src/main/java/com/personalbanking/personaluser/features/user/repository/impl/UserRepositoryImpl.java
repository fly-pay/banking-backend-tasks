package com.personalbanking.personaluser.features.user.repository.impl;
import com.personalbanking.personaluser.features.getUsersFromAccounts.dto.FromAccountOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetMe.*;

import com.personalbanking.personaluser.features.user.dtos.GetRecentTransferList.GetRecentTransferOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetAccountResDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetTransactionHistoryOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetUserResDto;
import com.personalbanking.personaluser.features.user.dtos.SwitchAccount.AccountDetailsResDto;
import com.personalbanking.personaluser.features.user.dtos.UpdateMe.UpdateMeReqDto;
import com.personalbanking.personaluser.features.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    private final RowMapper<GetMeResDto> getMeOptionRowMapper = (rs, rowNum) -> {
        return new GetMeResDto(
                rs.getString("email"),
                rs.getString("username"),
                rs.getString("fullname"),
                rs.getString("phone_number"),
                rs.getString("address"),
                rs.getDate("date_of_birth").toString(),

                new GenderDto(
                        rs.getInt("gender_id"),
                        rs.getString("gender_name")
                ),

                new NationalityDto(
                        rs.getInt("nationality_id"),
                        rs.getString("nationality_name")
                ),

                rs.getBoolean("is_policy_agreement"),
                rs.getBoolean("is_auto_save_receipt"),
                rs.getBoolean("is_first_time_login"),
                rs.getBoolean("has_initial_pin"),
                rs.getDouble("account_balance"),

                new SelectAccountDetailsDto(
                        rs.getInt("account_id"),
                        rs.getString("account_number"),
                        rs.getDouble("account_balance")
                )
        );
    };


    private final RowMapper<FromAccountOptionDto> fromAccountOptionRowMapper = (rs, rowNum) -> {

        return new FromAccountOptionDto(
                rs.getInt("id"),
                rs.getString("account_number"),
                rs.getDouble("current_balance")
        );
    };

    @Override
    @Transactional
    public GetMeResDto getMe(Long userId) {
        String sql = """
    SELECT
        u.email,
        u.username,
        p.fullname,
        p.phone_number,
        p.address,
        p.date_of_birth,
        g.id AS gender_id,
        g.name AS gender_name,
        n.id AS nationality_id,
        n.name AS nationality_name,
        p.is_policy_agreement,
        p.is_auto_save_receipt,
        u.is_first_time_login,
        p.has_initial_pin,
        a.current_balance AS account_balance,
        a.id AS account_id,
        a.account_number
    FROM users u
             LEFT JOIN gender g ON g.id = u.gender_id
             LEFT JOIN nationality n ON n.id = u.nationality_id
             LEFT JOIN account_detail a ON a.id = u.selected_account_id
             LEFT JOIN profile_detail p ON p.id = u.profile_id
    WHERE u.id = ?;
""";
        return jdbcTemplate.queryForObject(sql, getMeOptionRowMapper, userId);
    }

    @Override
    @Transactional
    public GetMeResDto updateMe(Long userId, UpdateMeReqDto updateMeReqDto) {
        Date dateOfBirth = Date.valueOf(updateMeReqDto.dateOfBirth());
        String sql = """
            UPDATE profile_detail
            SET
                fullname = ?,
                date_of_birth = ?,
                gender_id = ?,
                nationality_id = ?,
                phone_number = ?,
                address = ?
            FROM users u
            WHERE u.id = ? AND u.profile_id = profile_detail.id;
        """;
        int rowUpdated= jdbcTemplate.update(sql,
                updateMeReqDto.fullname(),
                dateOfBirth,
                updateMeReqDto.genderId(),
                updateMeReqDto.nationalityId(),
                updateMeReqDto.phoneNumber(),
                updateMeReqDto.address(),
                userId
                );
        if (rowUpdated > 0) {
            return getMe(userId);
        }else{
            throw new RuntimeException("No row updated");
        }

    }

    @Override
    @Transactional
    public List<FromAccountOptionDto> findAllFromAccountsByUserId(Long userId) {

        String sql = "select id, account_number, current_balance from account_detail where user_id = ?";

        return jdbcTemplate.query(sql, fromAccountOptionRowMapper, userId);
    }

    @Override
    @Transactional
    public String updateSaveReceipt(Long userId,boolean saveReceipt) {
        String sql= """
                UPDATE profile_detail
                SET is_auto_save_receipt = ?
                FROM users u
                WHERE u.id = ? AND u.profile_id = profile_detail.id;
                """;
        int rowUpdated= jdbcTemplate.update(sql,saveReceipt,userId);
        System.out.println(rowUpdated+" from profile_detail ,column is_auto_save_receipt ");
        return "Auto Save Receipt Enabled!!!";
    }

    @Override
    @Transactional
    public String verifyPin(Long userId) {
         String sql= """
                 SELECT pd.pin
                FROM profile_detail pd
                JOIN users u ON pd.id = u.profile_id
                WHERE u.id = ? AND pd.id = u.profile_id;
                """;
         String hashPin=jdbcTemplate.queryForObject(sql,String.class,userId);
         return hashPin;
    }

    @Override
    @Transactional
    public String setPin(Long userId, String hashedPin) {
        String sql= """
                UPDATE profile_detail
                SET
                    pin = ?,
                    has_initial_pin = TRUE
                FROM users u
                WHERE u.id = ? AND u.profile_id = profile_detail.id;
                """;
        int rowUpdated= jdbcTemplate.update(sql,hashedPin,userId);
        return "Set Pin successfully!!!";
    }

    @Override
    @Transactional
    public String switchAccount(Long userId, int accountId) {
        try {
            // Update profile_detail table
            String profileDetailSql = """
            UPDATE profile_detail pd
            SET selected_account_id = ?
            FROM users u
            WHERE u.id = ? AND u.profile_id = pd.id;
        """;
            jdbcTemplate.update(profileDetailSql, accountId, userId);

            // update users table for get /me to align with switch account
            String usersSql = """
            UPDATE users u
            SET selected_account_id = ?
            WHERE u.id = ?;
        """;
            jdbcTemplate.update(usersSql, accountId, userId);

            return "Switch Account Successfully!!!";
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            return "Switch Account Failed!!!";
        }
    }

    @Override
    @Transactional
    public List<AccountDetailsResDto> findAccountById(Long userId) {
        String sql = """
        SELECT id, account_number, current_balance
        FROM account_detail
        WHERE user_id = ?
    """;

        return jdbcTemplate.query(
                sql,
                new Object[]{userId},
                AccountDetailsRowMapper()
        );
    }

    @Override
    @Transactional
    public String getUserPassword(Long userId) {
        String sql= """
                SELECT password FROM users
                WHERE id = ?
                """;

        return jdbcTemplate.queryForObject(sql,String.class,userId);
    }

    @Override
    public String updateUserPassword(Long userId, String newPassword) {
        String sql= """
                UPDATE users u
                SET password = ?
                FROM profile_detail pd
                WHERE u.id = ? AND u.profile_id = pd.id;
                """;
        try{
            jdbcTemplate.update(sql,newPassword,userId);
            return "Password Updated Successfully!!!";
        }catch (EmptyResultDataAccessException e){
            return "null";
        }
    }

    @Override
    @Transactional
    public String updateAgreePolicy(Long userId, boolean updateAgreePolicy) {
        String sql = """
            
                UPDATE profile_detail pd
                SET is_policy_agreement = ?
                FROM users u
                WHERE u.profile_id = pd.id
                AND u.id = ?
            """;
        try {
            // Execute the update query
            int rowsAffected = jdbcTemplate.update(sql, updateAgreePolicy, userId);
            System.out.println("Rows affected: " + rowsAffected);

            if (rowsAffected == 0) {
                return "No user found or profile_id mismatch.";
            }

            return "Agree Policy Updated Successfully!!!";
        } catch (Exception e) {
            // Handle any potential exceptions
            e.printStackTrace();
            return "Error occurred while updating the policy agreement.";
        }
    }

    @Override
    public List<GetTransactionHistoryOptionDto> getTransactionHistory(Long userId) {

        String sql = """
    SELECT 
        t.created_at,
        t.amount,
        other_user.id AS user_id,
        other_pd.fullname AS user_name,
        other_ad.id AS account_id,
        other_ad.account_number AS account_number,
        other_ad.current_balance AS account_balance,
        t.credit_account_id = user_ad.id AS is_income
    FROM transaction t
    JOIN account_detail user_ad 
        ON user_ad.id IN (t.debit_account_id, t.credit_account_id)
        AND user_ad.user_id = ?
    JOIN account_detail other_ad 
        ON (t.debit_account_id = other_ad.id OR t.credit_account_id = other_ad.id)
        AND other_ad.id != user_ad.id
    JOIN users other_user ON other_user.id = other_ad.user_id
    JOIN profile_detail other_pd ON other_pd.id = other_user.profile_id
    ORDER BY t.created_at DESC
    """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new GetTransactionHistoryOptionDto(
                        new GetUserResDto(
                                rs.getLong("user_id"),
                                rs.getString("user_name")
                        ),
                        new GetAccountResDto(
                                rs.getInt("account_id"),
                                rs.getString("account_number"),
                                rs.getDouble("account_balance")
                        ),
                        rs.getBoolean("is_income")
                ),
                userId
        );
    }

    @Override
    public List<GetRecentTransferOptionDto> getRecentTransferList(Long userId) {
        String sql = """
    SELECT 
        t.created_at,
        t.amount,
        other_user.id AS user_id,
        other_pd.fullname AS user_name,
        other_ad.id AS account_id,
        other_ad.account_number AS account_number,
        other_ad.current_balance AS account_balance,
        t.credit_account_id = user_ad.id AS is_income
    FROM transaction t
    JOIN account_detail user_ad 
        ON user_ad.id IN (t.debit_account_id, t.credit_account_id)
        AND user_ad.user_id = ?
    JOIN account_detail other_ad 
        ON (t.debit_account_id = other_ad.id OR t.credit_account_id = other_ad.id)
        AND other_ad.id != user_ad.id
    JOIN users other_user ON other_user.id = other_ad.user_id
    JOIN profile_detail other_pd ON other_pd.id = other_user.profile_id
    ORDER BY t.created_at DESC LIMIT 5
    """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new GetRecentTransferOptionDto(
                        new GetUserResDto(
                                rs.getLong("user_id"),
                                rs.getString("user_name")
                        ),
                        new GetAccountResDto(
                                rs.getInt("account_id"),
                                rs.getString("account_number"),
                                rs.getDouble("account_balance")
                        ),
                        rs.getBoolean("is_income")
                ),
                userId
        );
    }

    private RowMapper<AccountDetailsResDto> AccountDetailsRowMapper() {
        return (rs, rowNum) ->new AccountDetailsResDto(
                rs.getLong("id"),
                rs.getString("account_number"),
                rs.getDouble("current_balance")
        );

    }
}
