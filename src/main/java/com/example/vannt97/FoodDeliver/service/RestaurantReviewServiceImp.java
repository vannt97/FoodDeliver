package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.RestaurantReview;
import com.example.vannt97.FoodDeliver.repository.RestaurantReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantReviewServiceImp implements RestaurantReviewService {

    @Autowired
    RestaurantReviewRepository restaurantReviewRepository;

    @Override
    public List<RestaurantReview> getAllRestaurantReviews() {
        return restaurantReviewRepository.findAll();
    }
}
