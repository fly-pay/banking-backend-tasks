package com.personalbanking.gateway.dto.userdtos.GetTransactionHistory;

public record GetAccountResDto(
    int id,
    String accountNumber,
    double balance
) {
}
