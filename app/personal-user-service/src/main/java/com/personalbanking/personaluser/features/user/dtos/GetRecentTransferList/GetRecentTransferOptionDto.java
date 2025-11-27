package com.personalbanking.personaluser.features.user.dtos.GetRecentTransferList;

import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetAccountResDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetUserResDto;

public record GetRecentTransferOptionDto(
        GetUserResDto getUserResDto,
        GetAccountResDto getAccountResDto,
        boolean isIncome
) {
}
