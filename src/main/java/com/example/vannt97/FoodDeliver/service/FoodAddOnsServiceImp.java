package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.FoodAddOns;
import com.example.vannt97.FoodDeliver.repository.FoodAddOnRepository;
import com.example.vannt97.FoodDeliver.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodAddOnsServiceImp implements FoodAddOnsService{

    @Autowired
    FoodAddOnRepository foodAddOnRepository;
    @Override
    public List<FoodAddOns> getAllFoodAddOns() {
        return foodAddOnRepository.findAll();
    }
}
