package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {
    public List<Food> findAll();
}
