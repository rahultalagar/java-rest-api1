package com.example.demo.dto.response;


import lombok.Data;


@Data

public class TaskResponse {

    private Long id;
    private String title;
    private String description;
    private Integer priority;


    
}
