xpackage com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;    

   private String Customer_Name;
   private int GST;
   private int total;
   private double final_total;

   
   public Long getId() {
     return id;
   }
   public void setId(Long id) {
     this.id = id;
   }
   public String getCustomer_Name() {
     return Customer_Name;
   }
   public void setCustomer_Name(String customer_Name) {
     Customer_Name = customer_Name;
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
