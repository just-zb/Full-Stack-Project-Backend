package com.michael.fullstackprojectbackend.service.business.user.impl;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import com.michael.fullstackprojectbackend.service.business.user.UserBusinessService;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBusinessServiceImpl implements UserBusinessService {
    private final UserService userService;

    @Override
    public ResponseEntity<ResultFormat> getUserInfo(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<ResultFormat> getPostsByUserId(Long userId, Integer currentPage, Integer pageSize, Boolean isAsc) {
        return null;
    }
}
