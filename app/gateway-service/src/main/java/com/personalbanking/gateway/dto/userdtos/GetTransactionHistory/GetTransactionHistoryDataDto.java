package com.personalbanking.gateway.dto.userdtos.GetTransactionHistory;

import java.util.List;

public record GetTransactionHistoryDataDto(
        List<GetTransactionHistoryOptionDto> getTransactionHistoryOptionDtoList
) {

}
