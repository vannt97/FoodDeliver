package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.FoodReview;
import com.example.vannt97.FoodDeliver.repository.FoodReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodReviewServiceImp implements FoodReviewService {
    @Autowired
    FoodReviewRepository foodReviewRepository;
    @Override
    public List<FoodReview> getAllFoodReviews() {
        return foodReviewRepository.findAll();
    }
}
