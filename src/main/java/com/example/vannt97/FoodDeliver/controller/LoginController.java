package com.example.vannt97.FoodDeliver.controller;

import com.example.vannt97.FoodDeliver.entity.UserEntity;
import com.example.vannt97.FoodDeliver.jwt.JwtTokenHelper;
import com.example.vannt97.FoodDeliver.payload.request.SignInRequest;
import com.example.vannt97.FoodDeliver.payload.response.DataResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataTokenResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataUserResponse;
import com.example.vannt97.FoodDeliver.services.LoginService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("")
public class LoginController {

    @Autowired
    LoginService loginService;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtTokenHelper jwtTokenHelper;




    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SignInRequest signInRequest) throws JsonProcessingException {
        UsernamePasswordAuthenticationToken authReq
                = new UsernamePasswordAuthenticationToken(signInRequest.getEmail(), signInRequest.getPassword());
        Authentication auth = authenticationManager.authenticate(authReq);
        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(auth);

        UserEntity user = loginService.checkLogin(signInRequest.getEmail());

        DataTokenResponse dataTokenResponse = jwtTokenHelper.genaralToken(new DataUserResponse(
                user.getEmail(), user.getFullname(),user.getPhoneNumber()));

//        jwtTokenHelper.decodeToken(dataTokenResponse.getToken());
//        String result = jwtTokenHelper.decodeTokenBuoiHoc(dataTokenResponse.getToken());
//        System.out.println(result);

        DataResponse dataResponse = new DataResponse();


        if(user != null){
            dataResponse.setStatus(HttpStatus.OK.value());
            dataResponse.setSuccess(true);
            dataResponse.setData(dataTokenResponse);
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
