package com.michael.fullstackprojectbackend.constants;

public final class RedisKeyConstants {

    private RedisKeyConstants() {}

    public static final String SPLIT = ":";
    // User related keys
    public static final String LOGIN = "login";
    public static final String REGISTER = "register";
    public static final String FORGET_PASSWORD = "forget_password";
    public static final String RESET_PASSWORD = "reset_password";
    public static final String ACTIVATE_ACCOUNT = "activate_account";
    public static final String CHANGE_EMAIL = "change_email";

    // User information cache
    public static final String USER_INFO = "user";

    public static String buildUserCacheKey(Long userId) {
        return USER_INFO + SPLIT + userId;
    }
}
