package com.personalbanking.personaluser.features.user.dtos.GetFromAccount;

import java.util.List;

public record FromAccountDataDto(
        List<FromAccountOptionDto> fromAccountOptions
) {}
