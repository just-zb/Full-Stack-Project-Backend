package com.michael.fullstackprojectbackend.service.validator;

import com.michael.fullstackprojectbackend.entity.user.User;
import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import com.michael.fullstackprojectbackend.exception.BusinessException;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import com.michael.fullstackprojectbackend.service.handler.UserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserValidator {
    private final UserService userService;
    private final UserHandler userHandler;

    public User validateUserIdExists(Long userId) {
        User userEntity = userHandler.getUser(userId);
        if (userEntity == null)
            throw new BusinessException(ResultCodeEnum.USER_NOT_FOUND);
        return userEntity;
    }
}
