package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Request.TaskRequest;
import com.example.demo.dto.response.Apiresponse;
import com.example.demo.dto.response.TaskResponse;
import com.example.demo.entity.TaskEntity;
import com.example.demo.service.Taskservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class Taskcontroller {
     public final Taskservice taskservice;

     public Taskcontroller(Taskservice taskservice) {
        this.taskservice = taskservice;
     }


     @PostMapping("/bulk")
     public Apiresponse<List<TaskResponse>> CreateTasks (@Valid@RequestBody List<TaskRequest> request){
         List<TaskResponse> responses = taskservice.createtask(request);
         return new Apiresponse<List<TaskResponse>>("sucess", responses);
     }

     @GetMapping
     public Apiresponse<Page<TaskEntity>> getTasks(Pageable pageable){
       Page<TaskEntity> response = taskservice.getTasks(pageable);
       return new Apiresponse<Page<TaskEntity>>("success", response);
     }
     


    
}
