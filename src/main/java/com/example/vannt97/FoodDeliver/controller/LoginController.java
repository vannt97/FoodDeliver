package com.example.vannt97.FoodDeliver.controller;

import com.example.vannt97.FoodDeliver.payload.request.SignInRequest;
import com.example.vannt97.FoodDeliver.payload.response.DataResponse;
import com.example.vannt97.FoodDeliver.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/signin")
public class LoginController {

    @Autowired
    LoginService loginService;
    @PostMapping("")
    public ResponseEntity<?> signin(@RequestBody SignInRequest signInRequest){
        DataResponse dataResponse = new DataResponse();
        if(loginService.checkLogin(signInRequest.getEmail(),signInRequest.getPassword())){
            dataResponse.setStatus(HttpStatus.OK.value());
            dataResponse.setSuccess(true);
            dataResponse.setData("");
            dataResponse.setDesc("Login Success");
        }else {
            dataResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
            dataResponse.setSuccess(false);
            dataResponse.setData("");
            dataResponse.setDesc("Login Fail");
        }

        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }
}
