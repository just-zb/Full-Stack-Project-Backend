package com.michael.fullstackprojectbackend.service.base;

import java.util.concurrent.TimeUnit;

public interface RedisService {

    void set(String key, String value);

    String get(String key);

    <T> T getObject(String key, Class<T> clazz);

    void set(String key, String value, long timeout, TimeUnit unit);

    boolean hasKey(String key);

    void delete(String key);

    void setTemporarilyByMinutes(String key, String value, long timeoutByMinutes);

    void setObjectTemporarilyByMinutes(String key, Object value, long timeoutByMinutes);
}

