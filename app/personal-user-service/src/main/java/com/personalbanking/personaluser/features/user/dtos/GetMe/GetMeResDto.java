package com.personalbanking.personaluser.features.user.dtos.GetMe;


public record GetMeResDto (
        String email,
        String username,
        String fullname,
        String phoneNumber,
        String address,
        String dateOfBirth,
        GenderDto gender,
        NationalityDto nationality,
        boolean isPolicyAgreement,
        boolean isAutoSaveReceipt,
        boolean isFirstTimeLogin,
        boolean hasInitialPin,
        double currentBalance,
        SelectAccountDetailsDto selectAccountDetails
)
{ }

