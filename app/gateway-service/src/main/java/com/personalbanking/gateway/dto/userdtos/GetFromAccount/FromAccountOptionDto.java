package com.personalbanking.gateway.dto.userdtos.GetFromAccount;

public record FromAccountOptionDto(
        Long id,
        String accountNumber,
        double balance
) {
}
