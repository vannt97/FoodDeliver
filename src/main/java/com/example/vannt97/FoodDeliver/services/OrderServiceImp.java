package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.OrderEntity;
import com.example.vannt97.FoodDeliver.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
}
