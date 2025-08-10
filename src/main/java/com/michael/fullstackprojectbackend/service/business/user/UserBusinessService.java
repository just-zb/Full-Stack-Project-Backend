package com.michael.fullstackprojectbackend.service.business.user;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import org.springframework.http.ResponseEntity;

public interface UserBusinessService {
    ResponseEntity<ResultFormat> getUserInfo(Long userId);
    ResponseEntity<ResultFormat> getPostsByUserId(
            Long userId,
            Integer currentPage,
            Integer pageSize,
            Boolean isAsc
    );
}
