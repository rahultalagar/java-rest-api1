package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Request.ProductRequest;
import com.example.demo.dto.Response.ApiResponse;
import com.example.demo.dto.Response.ProductResponse;
import com.example.demo.service.Productservice;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final Productservice productservice;

    public ProductController(Productservice productservice) {
        this.productservice = productservice;
    }
    
    @PostMapping("/process")
    public ApiResponse<ProductResponse> getresult(@RequestBody ProductRequest request){
        ProductResponse result=productservice.processProduct(request);
        return new ApiResponse<ProductResponse>("success", result);
    }    
    
    @GetMapping("/results")
    public ApiResponse<List<ProductResponse>> getAllProductResult(){
        List<ProductResponse> result= productservice.getAllproduct();
        return new ApiResponse<>("success", result);
    }
}
