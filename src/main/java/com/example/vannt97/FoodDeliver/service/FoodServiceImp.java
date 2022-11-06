package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.Food;
import com.example.vannt97.FoodDeliver.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImp implements FoodService{
    @Autowired
    FoodRepository foodRepository;
    @Override
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}
