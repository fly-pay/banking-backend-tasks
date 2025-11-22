package com.personalbanking.personaluser.features.user.repository;

import com.personalbanking.personaluser.features.getUsersFromAccounts.dto.FromAccountOptionDto;

import com.personalbanking.personaluser.features.user.dtos.GetMe.GetMeResDto;
import com.personalbanking.personaluser.features.user.dtos.GetRecentTransferList.GetRecentTransferOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetTransactionHistoryOptionDto;
import com.personalbanking.personaluser.features.user.dtos.SwitchAccount.AccountDetailsResDto;
import com.personalbanking.personaluser.features.user.dtos.UpdateMe.UpdateMeReqDto;

import java.util.List;

public interface UserRepository {
    GetMeResDto getMe(Long userId);

    GetMeResDto updateMe(Long userId, UpdateMeReqDto updateMeReqDto);

    List<FromAccountOptionDto> findAllFromAccountsByUserId(Long userId);

    String updateSaveReceipt(Long userId, boolean saveReceipt);

    String verifyPin(Long userId);

    String setPin(Long userId, String setPinReqDto);

    String switchAccount(Long userId, int switchAccountReqDto);

    List<AccountDetailsResDto> findAccountById(Long userId);

    String getUserPassword(Long userId);

    String updateUserPassword(Long userId, String newPassword);

    String updateAgreePolicy(Long userId,boolean updateAgreePolicy);

    List<GetTransactionHistoryOptionDto> getTransactionHistory(Long userId);

    List<GetRecentTransferOptionDto> getRecentTransferList(Long userId);

}

