package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.Material;
import com.example.vannt97.FoodDeliver.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialServiceImp implements MaterialService{
    @Autowired
    MaterialRepository materialRepository;
    @Override
    public List<Material> getALlMaterials() {
        return materialRepository.findAll();
    }
}
