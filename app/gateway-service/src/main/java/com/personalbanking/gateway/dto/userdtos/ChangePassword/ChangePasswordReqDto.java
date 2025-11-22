package com.personalbanking.gateway.dto.userdtos.ChangePassword;

public record ChangePasswordReqDto(
        String oldPassword,
        String newPassword
) {
}
