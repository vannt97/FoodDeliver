package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Integer> {
    public List<FoodOrder> findAll();
}
