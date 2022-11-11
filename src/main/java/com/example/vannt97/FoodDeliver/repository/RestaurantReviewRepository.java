package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.RestaurantReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestaurantReviewRepository extends JpaRepository<RestaurantReviewEntity,Integer> {
    public List<RestaurantReviewEntity> findAll();
}
