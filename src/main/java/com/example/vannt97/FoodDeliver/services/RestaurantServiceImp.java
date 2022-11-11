package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.RestaurantEntity;
import com.example.vannt97.FoodDeliver.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImp implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;
    @Override
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
