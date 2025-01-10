package com.example.hospitalmanagement.pojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Table(name = "schedule")
public class Schedule {
    private Long id;
    private Doctor doctor;
    private Nurse nurse;
    private Department department;
    private LocalDateTime date;
    private String shift;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
