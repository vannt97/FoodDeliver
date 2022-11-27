package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public List<UserEntity> findAll();

    public List<UserEntity> findByEmailAndPassword(String email, String password);

    public List<UserEntity> findByEmail(String email);
}
