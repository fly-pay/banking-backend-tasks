package com.personalbanking.personaluser.features.user.dtos.SwitchAccount;

public record AccountDetailsResDto(
        Long id,
        String account_number,
        double current_balance
) {
}
