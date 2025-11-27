package com.personalbanking.gateway.dto.userdtos.GetMe;

public record SelectAccountDetailsDto (
        int id,
        String accountNumber,
        double balance
){ }
