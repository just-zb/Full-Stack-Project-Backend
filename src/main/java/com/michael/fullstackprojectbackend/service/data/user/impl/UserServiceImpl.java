package com.michael.fullstackprojectbackend.service.data.user.impl;

import com.michael.fullstackprojectbackend.entity.user.User;
import com.michael.fullstackprojectbackend.repository.user.UserRepository;
import com.michael.fullstackprojectbackend.service.data.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Long getUserCount() {
        return 0L;
    }

    @Override
    public void saveUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }
}
