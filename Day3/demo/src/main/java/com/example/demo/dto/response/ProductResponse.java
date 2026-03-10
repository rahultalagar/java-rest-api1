package com.example.demo.dto.response;

public class ProductResponse {
    private String customer_name;
    private int gst;
    private int total_amount;
    private int final_amount;

    
    public ProductResponse(String customer_name, int gst, int total_amount, int final_amount) {
        this.customer_name = customer_name;
        this.gst = gst;
        this.total_amount = total_amount;
        this.final_amount = final_amount;
    }


    public String getCustomer_name() {
        return customer_name;
    }


    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }


    public int getGst() {
        return gst;
    }


    public void setGst(int gst) {
        this.gst = gst;
    }


    public int getTotal_amount() {
        return total_amount;
    }


    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }


    public int getFinal_amount() {
        return final_amount;
    }


    public void setFinal_amount(int final_amount) {
        this.final_amount = final_amount;
    }

    

    
}
