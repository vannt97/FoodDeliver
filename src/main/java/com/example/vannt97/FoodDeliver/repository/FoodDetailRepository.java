package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDetailRepository extends JpaRepository<FoodDetailEntity,Integer> {
    public List<FoodDetailEntity> findAll();
}
