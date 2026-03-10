package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addition {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    
    @GetMapping("/add/{a}/{b}")
    public int adds(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @PostMapping("/add")
    public int add(@RequestBody Numbers numbers) {

        int sum = numbers.getA() + numbers.getB();

        return sum;
    }
    @PostMapping("/addForm")
    public int addnumberform(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/mean")   
    public String mean1(@RequestBody meanofstudent  marks) {

        int sum = marks.getS1() + marks.getS2() + marks.getS3()
                + marks.getS4() + marks.getS5();
            
        
        
        double mean = sum / 5.0;
         

        if (mean > 80) {
            return "Mean = " + mean + " (Above 80)"+" sum = "+sum;
        } else {
            return "Mean = " + mean + " (Below 80)"+" sum = "+sum;
        }
              
    }
}
