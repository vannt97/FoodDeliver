package com.example.vannt97.FoodDeliver.repository;

import com.example.vannt97.FoodDeliver.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaterialRepository extends JpaRepository<Material,Integer> {
    public List<Material> findAll();
}
