package com.personalbanking.personaluser.features.user.dtos.GetMe;

public record SelectAccountDetailsDto (
        int id,
        String accountNumber,
        double balance
){ }
