package com.michael.fullstackprojectbackend.service.data.user;

public interface UserService {
    Long getUserCount();
    void saveUser(String username, String password);
}
