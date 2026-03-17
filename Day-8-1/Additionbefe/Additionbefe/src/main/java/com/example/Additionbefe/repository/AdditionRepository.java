package com.example.Additionbefe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Additionbefe.entity.AddionEntity;

public interface AdditionRepository  extends JpaRepository<AddionEntity, Long> {
    
}
