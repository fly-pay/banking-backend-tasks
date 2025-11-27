package com.personalbanking.gateway.dto.userdtos.GetFromAccount;

import java.util.List;

public record FromAccountDataDto(
        List<FromAccountOptionDto> fromAccountOptions
) {}
