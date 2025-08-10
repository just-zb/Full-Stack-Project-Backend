package com.michael.fullstackprojectbackend.controller.user;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import com.michael.fullstackprojectbackend.result.ResultResponse;
import com.michael.fullstackprojectbackend.service.business.user.UserBusinessService;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserBusinessService userBusinessService;
    /*
    getUserInfo is a method to retrieve user information.
    It accepts an optional userId parameter to specify which user's information to retrieve.
     */
    @GetMapping("/info")
    public ResponseEntity<ResultFormat> getUserInfo(
            @RequestParam(name = "userId", required = false) Long userId
    ){
        return ResultResponse.success(null);
    }

    /*
    getPosts is a method to retrieve posts made by a user.
    It accepts optional parameters for userId, currentPage, pageSize, and isAsc to
    control the pagination and sorting of the posts.
     */
    @GetMapping("/posts")
    public ResponseEntity<ResultFormat> getPosts(
            @RequestParam(name="userId", required = false) Long userId,
            @RequestParam(name="currentPage", defaultValue = "1") Integer currentPage,
            @RequestParam(name="pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(name="isAsc", defaultValue = "false") Boolean isAsc
    ){
        return ResultResponse.success(String.valueOf(userId) + currentPage + pageSize + isAsc);
    }

    @GetMapping("/create")
    public ResponseEntity<ResultFormat> createUser(
            @RequestParam(name="username") String username,
            @RequestParam(name="password") String password
    ){
        return userBusinessService.createUser(username, password);
    }
}
