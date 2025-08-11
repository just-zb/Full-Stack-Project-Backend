package com.michael.fullstackprojectbackend.service.data.user;

import com.michael.fullstackprojectbackend.entity.user.User;

import java.util.Date;
import java.util.List;

public interface UserService {

    Long getUserCount();

    void saveUser(String username, String password);

    User getUserById(Long userId);

    List<User> getUsersByIds(List<Long> ids);

    User getUserByName(String username);

    User getUserByEmail(String email);

    boolean updateUser(User user);

    boolean  addUser(User user);

    boolean  updateUsername(Long id, String username);

    boolean  updatePassword(Long id, String password);

    boolean  updateEmail(Long id, String email);

    Date getLastUsernameUpdateTime(Long id);

    Date getLastEmailUpdateTime(Long id);
}
