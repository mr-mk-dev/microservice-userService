package me.manishcodes.userservice.entity;

import jakarta.persistence.*;
import me.manishcodes.userservice.enums.Role;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long userId;

    private String name;
    private String email;
    private String phoneNo;
    private String password;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String updatedAt ;
    private Role role;
}
