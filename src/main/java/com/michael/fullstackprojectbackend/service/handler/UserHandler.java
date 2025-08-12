package com.michael.fullstackprojectbackend.service.handler;

import com.michael.fullstackprojectbackend.constants.RedisKeyConstants;
import com.michael.fullstackprojectbackend.entity.user.User;
import com.michael.fullstackprojectbackend.service.base.RedisService;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserHandler {

    private final UserService userService;
    private final RedisService redisService;

    public User getUser(Long userId) {
        String key = RedisKeyConstants.buildUserCacheKey(userId);
        User user;
        if(!redisService.hasKey(key)) {
            user = userService.getUserById(userId);
            if (user == null) {
                return null;
            }
            // Store the user in Redis with a temporary expiration time
            redisService.setObjectTemporarilyByMinutes(key, user, 3);
            return user;
        }
        user = redisService.getObject(key, User.class);
        redisService.setObjectTemporarilyByMinutes(key, user, 3);
        return user;
    }

    public void updateUserCache(Long userId) {
        User user = userService.getUserById(userId);
        String key = RedisKeyConstants.buildUserCacheKey(userId);
        redisService.setObjectTemporarilyByMinutes(key, user, 3);
    }
}
