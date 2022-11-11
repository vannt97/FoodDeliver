package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.FoodDetailEntity;
import com.example.vannt97.FoodDeliver.repository.FoodDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodDetailServiceImp implements FoodDetailService{
    @Autowired
    FoodDetailRepository foodDetailRepository;
    @Override
    public List<FoodDetailEntity> getAllFoodDetails() {
        return foodDetailRepository.findAll();
    }
}
