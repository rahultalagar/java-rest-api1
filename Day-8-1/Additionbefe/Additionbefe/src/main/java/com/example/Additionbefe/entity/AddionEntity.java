package com.example.Additionbefe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "addition")
public class AddionEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private  int num1;
    private  int num2;
    private  int result;
    
}
