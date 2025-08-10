package com.michael.fullstackprojectbackend.enums;

public enum ResultCodeEnum {
    SUCCESS(20000, "Success"),
    BUSINESS_EXCEPTION(40000, "Business Error Unknown");

    private final int code;
    private final String message;

    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
