package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodAddOnsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodAddOnRepository extends JpaRepository<FoodAddOnsEntity,Integer> {
    public List<FoodAddOnsEntity> findAll();
}
