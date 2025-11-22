package com.personalbanking.personaluser.features.user.dtos.ChangePassword;

public record ChangePasswordReqDto(
        String oldPassword,
        String newPassword
) {
}
