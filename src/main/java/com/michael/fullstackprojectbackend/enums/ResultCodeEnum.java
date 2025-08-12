package com.michael.fullstackprojectbackend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {
    SUCCESS(20000, "Success"),

    BUSINESS_EXCEPTION(40000, "Business Error Unknown"),

    SYSTEM_EXCEPTION(50000, "System Exception"),

    USER_NOT_FOUND(40003, "User not found"),

    REDIS_SAVING_ERROR(40032, "Redis saving error");

    private final int code;
    private final String message;

}
