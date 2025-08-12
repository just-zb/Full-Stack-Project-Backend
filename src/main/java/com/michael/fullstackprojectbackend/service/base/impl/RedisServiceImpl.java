package com.michael.fullstackprojectbackend.service.base.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import com.michael.fullstackprojectbackend.exception.BusinessException;
import com.michael.fullstackprojectbackend.service.base.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

    private final StringRedisTemplate redisTemplate;

    private final ObjectMapper objectMapper;

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public <T> T getObject(String key, Class<T> clazz) {
        String json = get(key);
        if (json == null) {
            // TODO
            throw new BusinessException(ResultCodeEnum.USER_NOT_FOUND);
        }
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            //TODO
            throw new BusinessException(ResultCodeEnum.USER_NOT_FOUND);
        }
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit unit) {
        redisTemplate.opsForValue().set(key, value, timeout, unit);
    }

    @Override
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public void setTemporarilyByMinutes(String key, String value, long timeoutByMinutes) {
        redisTemplate.opsForValue().set(key, value, timeoutByMinutes, TimeUnit.MINUTES);
    }

    @Override
    public void setObjectTemporarilyByMinutes(String key, Object value, long timeoutByMinutes) {
        try {
            String val = objectMapper.writeValueAsString(value);
            setTemporarilyByMinutes(key, val, timeoutByMinutes);
        } catch (Exception e) {
            throw new BusinessException(ResultCodeEnum.REDIS_SAVING_ERROR);
        }
    }

}
