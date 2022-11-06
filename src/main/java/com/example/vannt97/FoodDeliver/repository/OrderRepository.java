package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    public List<Order> findAll();

}
