package com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory;

public record GetAccountResDto(
    int id,
    String accountNumber,
    double balance
) {
}
