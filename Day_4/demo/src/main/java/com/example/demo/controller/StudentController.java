package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Request.RegisterRequest;
import com.example.demo.dto.Request.StudentRequest;
import com.example.demo.dto.Response.ApiResponse;
import com.example.demo.dto.Response.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/request")
    public ApiResponse<StudentResponse> getResult(@RequestBody StudentRequest request) {
        StudentResponse result = studentService.getstStudentResponse(request);
        return new ApiResponse<StudentResponse>("sucess", result);

    }

    @PostMapping("/{id}/register")
    public ApiResponse<StudentResponse> assignRegister(@PathVariable Long id,
            @RequestBody RegisterRequest registerRequest)

    {
        StudentResponse response = studentService.assinRegisteration(id, registerRequest.getRegistrationNumber());
        return new ApiResponse<StudentResponse>("success", response);
    }

}
