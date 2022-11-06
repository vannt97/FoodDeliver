package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {
    public List<UserDetail> findAll();
}