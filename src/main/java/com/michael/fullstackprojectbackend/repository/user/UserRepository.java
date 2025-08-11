package com.michael.fullstackprojectbackend.repository.user;

import com.michael.fullstackprojectbackend.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);
}
