package com.michael.fullstackprojectbackend.repository.user;

import com.michael.fullstackprojectbackend.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query("UPDATE User u SET u.username = :username,u.lastUsernameUpdateTime=now() WHERE u.id = :id")
    int updateUsernameById(@Param("id") Long id, @Param("username") String username);

    @Modifying
    @Query("UPDATE User u SET u.password = :password WHERE u.id = :id")
    int updatePasswordById(@Param("id") Long id, @Param("password") String password);

    @Modifying
    @Query("UPDATE User u SET u.email = :email,u.lastEmailUpdateTime=now() WHERE u.id = :id")
    int updateEmailById(@Param("id") Long id, @Param("email") String email);

    User findByUsername(String username);

    User findByEmail(String email);
}
