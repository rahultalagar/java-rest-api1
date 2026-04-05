package com.example.demo.dto.Request;

import java.util.List;

public class ProductRequest {
     
    private String customer_Name;
    
    private List<Integer> product_price;

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public List<Integer> getProduct_price() {
        return product_price;
    }

    public void setProduct_price(List<Integer> product_price) {
        this.product_price = product_price;
    }

    
}
