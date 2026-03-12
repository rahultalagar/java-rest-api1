package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Request.StudentRequest;
import com.example.demo.dto.Response.StudentResponse;
import com.example.demo.entity.RegisterNumberEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.RegisterNumberRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegisterNumberRepository registerNumberRepository;

    public StudentService(StudentRepository studentRepository, RegisterNumberRepository registerNumberRepository) {
        this.studentRepository = studentRepository;
        this.registerNumberRepository = registerNumberRepository;
    }


    public StudentResponse getstStudentResponse(StudentRequest studentRequest) {
        StudentEntity student = new StudentEntity();
        student.setName(studentRequest.getName());

        StudentEntity entity = studentRepository.save(student);

        return new StudentResponse(entity.getId(),
                entity.getName(), entity.getRegisteration().getRegisterationNumber());
    }


    
    public StudentResponse assinRegisteration(Long StudentId, String regNumber) {

        StudentEntity student = studentRepository.findById(StudentId)
                .orElseThrow(() -> new RuntimeException("student not found"));


        RegisterNumberEntity register = new RegisterNumberEntity();
        register.setRegisterationNumber(regNumber);

        RegisterNumberEntity savedRegister = registerNumberRepository.save(register);


        student.setRegisteration(savedRegister);
        studentRepository.save(student);

        return new StudentResponse(student.getId(),
                student.getName(),
                savedRegister.getRegisterationNumber());

    }

}
