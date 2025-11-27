package com.personalbanking.gateway.dto.userdtos.GetTransactionHistory;

public record GetTransactionHistoryOptionDto(
        GetUserResDto getUserResDto,
        GetAccountResDto getAccountResDto,
        boolean isIncome
) {
}
