package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {
    public List<Status> findAll();
}
