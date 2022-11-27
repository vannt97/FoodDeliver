package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.UserDetailEntity;
import com.example.vannt97.FoodDeliver.entity.UserEntity;
import com.example.vannt97.FoodDeliver.repository.UserDetailRepository;
import com.example.vannt97.FoodDeliver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<UserDetailEntity> getAllUserDetails() {
        return userDetailRepository.findAll();
    }

    @Override
    public boolean checkLogin(String email, String password) {
        List<UserEntity> list = userRepository.findByEmailAndPassword(email,password);
        return list.size() > 0;
    }

    @Override
    public UserEntity checkLogin(String email) {
        List<UserEntity> list = userRepository.findByEmail(email);
        return list.size() > 0 ? list.get(0) : null;
    }


}
