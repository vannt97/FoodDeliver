package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.Category;
import com.example.vannt97.FoodDeliver.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
