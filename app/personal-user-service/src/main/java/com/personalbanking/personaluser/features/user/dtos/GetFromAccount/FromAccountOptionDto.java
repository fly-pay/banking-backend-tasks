package com.personalbanking.personaluser.features.user.dtos.GetFromAccount;

public record FromAccountOptionDto(
        Long id,
        String accountNumber,
        double balance
) {
}
