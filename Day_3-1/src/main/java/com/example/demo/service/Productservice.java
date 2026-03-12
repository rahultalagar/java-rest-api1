package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.dto.Request.ProductRequest;
import com.example.demo.dto.Response.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class Productservice {

      private final ProductRepository productRepository;

      public Productservice(ProductRepository productRepository) {
        this.productRepository = productRepository;
      }
      
   public ProductResponse processProduct( ProductRequest request)
   {
       int total=request.getProduct_price().stream().mapToInt(Integer::intValue).sum();
       int GST=18;
       double final_total= total+(total*GST/100);  //(double )

       Product product=new Product();
       product.setCustomer_Name(request.getCustomer_Name());
       product.setGST(GST);
       product.setTotal(total);
       product.setFinal_total(final_total);

       productRepository.save(product);
       

       return new ProductResponse(request.getCustomer_Name(),
         GST,total, final_total);

   }

   public List<ProductResponse> getAllproduct()
   {
      return productRepository.findAll()
      .stream()
      .map(product -> new ProductResponse(product.getCustomer_Name(),
      product.getGST(),
      product.getTotal(),
      product.getFinal_total())
    ).toList();
   }
    
}
