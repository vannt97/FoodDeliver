package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Integer> {
    public List<RestaurantEntity> findAll();
}
