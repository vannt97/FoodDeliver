package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodAddOns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodAddOnRepository extends JpaRepository<FoodAddOns,Integer> {
    public List<FoodAddOns> findAll();
}
