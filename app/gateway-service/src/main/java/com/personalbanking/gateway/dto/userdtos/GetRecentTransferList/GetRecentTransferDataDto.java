package com.personalbanking.gateway.dto.userdtos.GetRecentTransferList;

import java.util.List;

public record GetRecentTransferDataDto(
        List<GetRecentTransferOptionDto> getTransactionHistoryOptionDtoList
) {}