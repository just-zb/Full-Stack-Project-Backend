package com.michael.fullstackprojectbackend.service.business.user.impl;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import com.michael.fullstackprojectbackend.service.business.user.UserBusinessService;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import com.michael.fullstackprojectbackend.service.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBusinessServiceImpl implements UserBusinessService {
    private final UserService userService;

    private final UserValidator userValidator;

    @Override
    public ResponseEntity<ResultFormat> getUserInfo(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<ResultFormat> getPostsByUserId(Long userId, Integer currentPage, Integer pageSize, Boolean isAsc) {
        return null;
    }

    @Override
    public ResponseEntity<ResultFormat> getCommentsByUserId(Integer currentPage, Integer pageSize, Boolean isAsc) {
        return null;
    }

    @Override
    public ResponseEntity<ResultFormat> logout(String deviceId) {
        return null;
    }
}
