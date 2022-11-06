package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryService {

    public List<Category> getAll();
}
