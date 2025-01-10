package com.example.hospitalmanagement.pojo;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "nurse")
public class Nurse {
    private Long id;
    private User user;
    private Department department;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
