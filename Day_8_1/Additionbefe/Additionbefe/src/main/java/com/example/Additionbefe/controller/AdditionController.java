package com.example.Additionbefe.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Additionbefe.dto.Request.AdditionRequest;
import com.example.Additionbefe.dto.Response.AdditionResponse;
import com.example.Additionbefe.dto.Response.ApiResponse;
import com.example.Additionbefe.service.AdditionService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/addition")
public class AdditionController {
    private final AdditionService additionService;

    public AdditionController(AdditionService additionService) {
        this.additionService = additionService;
    }

    
    @PostMapping
    private ApiResponse createnum(@RequestBody AdditionRequest request)
    {
           AdditionResponse response=  additionService.createnumber(request);
           return new ApiResponse("success", response);
    }

}
