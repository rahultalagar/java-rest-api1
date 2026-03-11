package com.example.demo.dto.Response;

public class ProductResponse {
      private String customer_Name;
      private int GST;
      private int total;
      private double final_total;
      
      public ProductResponse(String customer_Name, int gST, int total, double final_total) {
        this.customer_Name = customer_Name;
        GST = gST;
        this.total = total;
        this.final_total = final_total;
      }

      public String getCustomer_Name() {
          return customer_Name;
      }

      public void setCustomer_Name(String customer_Name) {
          this.customer_Name = customer_Name;
      }

      public int getGST() {
          return GST;
      }

      public void setGST(int gST) {
          GST = gST;
      }

      public int getTotal() {
          return total;
      }

      public void setTotal(int total) {
          this.total = total;
      }

      public double getFinal_total() {
          return final_total;
      }

      public void setFinal_total(double final_total) {
          this.final_total = final_total;
      }

      
}  
