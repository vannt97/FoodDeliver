package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

    public List<OrderEntity> findAll();

}
