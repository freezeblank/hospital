package com.example.hospitalmanagement.pojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "doctor")
public class Doctor {
    private Long id;
    private User user;
    private Department department;
    private String title;
    private String expertise;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}