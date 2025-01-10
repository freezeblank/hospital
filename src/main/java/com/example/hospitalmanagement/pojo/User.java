package com.example.hospitalmanagement.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Table(name = "user")
public class User {
    @NotNull
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String name;
    private String role;
    private String phone;
    private String gender;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
