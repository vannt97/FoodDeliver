package com.example.vannt97.FoodDeliver.services;

import com.example.vannt97.FoodDeliver.entity.UserDetailEntity;
import com.example.vannt97.FoodDeliver.entity.UserEntity;

import java.util.List;

public interface LoginService {
    public List<UserEntity> getAllUsers();
    public List<UserDetailEntity> getAllUserDetails();

    public boolean checkLogin(String email, String password);

    public UserEntity checkLogin(String email);

}
