package com.personalbanking.gateway.dto.userdtos.UpdateMe;

public record UpdateMeReqDto(
        String fullname,
        String dateOfBirth,
        Integer genderId,
        Integer nationalityId,
        String phoneNumber,
        String address
) {
}
