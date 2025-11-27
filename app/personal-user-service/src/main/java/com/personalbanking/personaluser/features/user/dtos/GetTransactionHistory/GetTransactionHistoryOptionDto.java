package com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory;


public record GetTransactionHistoryOptionDto(
        GetUserResDto getUserResDto,
        GetAccountResDto getAccountResDto,
        boolean isIncome
) {
}
