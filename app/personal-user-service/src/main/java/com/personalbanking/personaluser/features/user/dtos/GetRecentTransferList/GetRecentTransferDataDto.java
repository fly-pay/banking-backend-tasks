package com.personalbanking.personaluser.features.user.dtos.GetRecentTransferList;

import java.util.List;

public record GetRecentTransferDataDto(
        List<GetRecentTransferOptionDto> getTransactionHistoryOptionDtoList
) {

}
