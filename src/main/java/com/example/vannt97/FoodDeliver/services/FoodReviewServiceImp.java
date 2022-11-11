package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.FoodReviewEntity;
import com.example.vannt97.FoodDeliver.repository.FoodReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodReviewServiceImp implements FoodReviewService {
    @Autowired
    FoodReviewRepository foodReviewRepository;
    @Override
    public List<FoodReviewEntity> getAllFoodReviews() {
        return foodReviewRepository.findAll();
    }
}
