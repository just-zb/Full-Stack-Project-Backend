package com.michael.fullstackprojectbackend.entity.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

}
