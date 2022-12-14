package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrderEntity,Integer> {
    public List<FoodOrderEntity> findAll();
}
