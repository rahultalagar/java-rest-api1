package com.example.demo.dto.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {
    @NotBlank(message = "Title cannot be blank")
    private String title;

    private String description;
    @Positive(message = "Priority must be a positive ")
    private Integer priority;
}
