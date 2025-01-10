package com.example.hospitalmanagement.pojo;

import com.example.hospitalmanagement.serializer.PasswordSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Table(name = "user")
public class User {
    private Long id;
    private String username;
    @JsonSerialize(using = PasswordSerializer.class)
    private String password;
    private String name;
    private String role;
    private String phone;
    private Character gender;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
