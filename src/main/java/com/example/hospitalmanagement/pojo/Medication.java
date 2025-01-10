package com.example.hospitalmanagement.pojo;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "medication")
public class Medication {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private Integer quantity;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
