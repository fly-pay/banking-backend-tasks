package com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory;

import java.util.List;

public record GetTransactionHistoryResDto(
    List<GetTransactionHistoryOptionDto> getTransactionHistoryOptionDtoList
) {
}
