package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.UserDetail;
import com.example.vannt97.FoodDeliver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailServiceImp implements UserDetailService{
    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public List<UserDetail> getAlluserDetails() {
        return userDetailRepository.findAll();
    }
}
