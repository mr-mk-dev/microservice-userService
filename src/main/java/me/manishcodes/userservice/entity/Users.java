package me.manishcodes.userservice.entity;

import me.manishcodes.userservice.enums.Role;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document()
public class Users {
    @Id
    private long userId;

    private String name;
    private String email;
    private String phoneNo;
    private String password;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String updatedAt ;
    private Role role;
}
