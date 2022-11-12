package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

    public List<CategoryEntity> findAll();
}
