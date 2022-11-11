package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.FoodOrderEntity;
import com.example.vannt97.FoodDeliver.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodOrderServiceImp implements FoodOrderService{

    @Autowired
    FoodOrderRepository foodOrderRepository;
    @Override
    public List<FoodOrderEntity> getAllFoodOrders() {
        return foodOrderRepository.findAll();
    }
}
