package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.FoodOrder;
import com.example.vannt97.FoodDeliver.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodOrderServiceImp implements FoodOrderService{

    @Autowired
    FoodOrderRepository foodOrderRepository;
    @Override
    public List<FoodOrder> getAllFoodOrders() {
        return foodOrderRepository.findAll();
    }
}
