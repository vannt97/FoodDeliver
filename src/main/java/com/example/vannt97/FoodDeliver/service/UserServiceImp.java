package com.example.vannt97.FoodDeliver.service;

import com.example.vannt97.FoodDeliver.entity.User;
import com.example.vannt97.FoodDeliver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
