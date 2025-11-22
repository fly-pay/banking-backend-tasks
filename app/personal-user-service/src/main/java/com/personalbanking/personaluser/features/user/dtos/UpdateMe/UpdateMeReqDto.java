package com.personalbanking.personaluser.features.user.dtos.UpdateMe;

public record UpdateMeReqDto(
        String fullname,
        String dateOfBirth,
        Integer genderId,
        Integer nationalityId,
        String phoneNumber,
        String address
) {
}
