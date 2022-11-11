package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodReviewRepository extends JpaRepository<FoodReviewEntity,Integer> {
    public List<FoodReviewEntity> findAll();
}
