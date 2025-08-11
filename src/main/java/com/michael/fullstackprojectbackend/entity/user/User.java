package com.michael.fullstackprojectbackend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String email;

    private String bio;

    private String nickname;

    private Date lastUsernameUpdateTime;

    private Date lastEmailUpdateTime;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;
}
