package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RegisterNumberEntity;

public interface RegisterNumberRepository extends JpaRepository<RegisterNumberEntity, Long> {

    
} 