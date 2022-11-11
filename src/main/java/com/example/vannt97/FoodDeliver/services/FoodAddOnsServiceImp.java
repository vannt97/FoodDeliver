package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.FoodAddOnsEntity;
import com.example.vannt97.FoodDeliver.repository.FoodAddOnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodAddOnsServiceImp implements FoodAddOnsService{

    @Autowired
    FoodAddOnRepository foodAddOnRepository;
    @Override
    public List<FoodAddOnsEntity> getAllFoodAddOns() {
        return foodAddOnRepository.findAll();
    }
}
