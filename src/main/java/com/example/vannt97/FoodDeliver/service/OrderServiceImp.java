package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.Order;
import com.example.vannt97.FoodDeliver.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
