package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.StatusEntity;
import com.example.vannt97.FoodDeliver.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusServiceImp implements StatusService{
    @Autowired
    StatusRepository statusRepository;
    @Override
    public List<StatusEntity> getALlStatus() {
        return statusRepository.findAll();
    }
}
