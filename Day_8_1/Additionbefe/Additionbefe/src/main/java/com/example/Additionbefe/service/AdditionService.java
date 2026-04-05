package com.example.Additionbefe.service;

import org.springframework.stereotype.Service;

import com.example.Additionbefe.dto.Request.AdditionRequest;
import com.example.Additionbefe.dto.Response.AdditionResponse;
import com.example.Additionbefe.entity.AddionEntity;
import com.example.Additionbefe.repository.AdditionRepository;

@Service
public class AdditionService {
    private final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }
    
    public AdditionResponse createnumber(AdditionRequest request)
    {
         int result=0;
          result= request.getNum1() + request.getNum2();
        
         AddionEntity entity = new AddionEntity();
        
          entity.setNum1(request.getNum1());
           entity.setNum2(request.getNum2());
           entity.setResult(result);

           AddionEntity savedEntity =additionRepository.save(entity);

           return new AdditionResponse(savedEntity.getNum1(), savedEntity.getNum2(), savedEntity.getResult());

    }
    


    
}
