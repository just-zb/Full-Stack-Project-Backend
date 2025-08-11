package com.michael.fullstackprojectbackend.service.data.user.impl;

import com.michael.fullstackprojectbackend.entity.user.User;
import com.michael.fullstackprojectbackend.repository.user.UserRepository;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Long getUserCount() {
        return userRepository.count();
    }

    @Override
    public void saveUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).isPresent() ? userRepository.findById(userId).get() : null;
    }

    @Override
    public List<User> getUsersByIds(List<Long> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public User getUserByName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean updateUser(User user) {
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean addUser(User user) {
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean updateUsername(Long id, String username) {
        // two strategies: 1. find and update 2. use a custom update method
        // use the second strategy for simplicity
        return false;
    }

    @Override
    public boolean updatePassword(Long id, String password) {
        return false;
    }

    @Override
    public boolean updateEmail(Long id, String email) {
        return false;
    }

    @Override
    public Date getLastUsernameUpdateTime(Long id) {
        return null;
    }

    @Override
    public Date getLastEmailUpdateTime(Long id) {
        return null;
    }
}
