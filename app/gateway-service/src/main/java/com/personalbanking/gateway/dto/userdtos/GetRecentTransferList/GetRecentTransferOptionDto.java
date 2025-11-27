package com.personalbanking.gateway.dto.userdtos.GetRecentTransferList;


import com.personalbanking.gateway.dto.userdtos.GetTransactionHistory.GetAccountResDto;
import com.personalbanking.gateway.dto.userdtos.GetTransactionHistory.GetUserResDto;

public record GetRecentTransferOptionDto(
        GetUserResDto getUserResDto,
        GetAccountResDto getAccountResDto,
        boolean isIncome
) {}
