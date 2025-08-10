package com.michael.fullstackprojectbackend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {
    SUCCESS(20000, "Success"),
    BUSINESS_EXCEPTION(40000, "Business Error Unknown");

    private final int code;
    private final String message;

}
