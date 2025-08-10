package com.michael.fullstackprojectbackend.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserChangePasswordDTO {

    @NotBlank(message = "Old password cannot be empty")
    @Size(min = 6, max = 20, message = "Old password length must be between 6 and 20")
    private String oldPassword;

    @NotBlank(message = "New password cannot be empty")
    @Size(min = 6, max = 20, message = "New password length must be between 6 and 20")
    private String newPassword;
}
