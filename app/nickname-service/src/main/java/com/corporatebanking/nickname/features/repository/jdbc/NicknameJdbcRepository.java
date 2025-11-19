package com.corporatebanking.nickname.features.repository.jdbc;

import java.util.List;
import java.util.Optional;

import com.corporatebanking.nickname.features.models.NicknameData;

public interface NicknameJdbcRepository {
    NicknameData save(NicknameData organization);
    Optional<NicknameData> findById(Long id);
    Optional<NicknameData> findByToAccountId(Long toAccountId);
    List<NicknameData> findAll();
    Optional<NicknameData> update(NicknameData organization);
    void deleteById(Long id);
}
