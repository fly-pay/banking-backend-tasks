package com.corporatebanking.nickname.features.models;

import java.time.LocalDate;

public record NicknameData(
    Long id,
    Long fromAccount,
    Long toAccount,
	String nickname,
    LocalDate createdAt,
    LocalDate updatedAt,
    Long createdBy,
    Long updatedBy
) {}
