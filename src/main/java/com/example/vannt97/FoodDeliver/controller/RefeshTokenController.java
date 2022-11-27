package com.example.vannt97.FoodDeliver.controller;

import com.example.vannt97.FoodDeliver.jwt.JwtTokenHelper;
import com.example.vannt97.FoodDeliver.payload.response.DataResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataTokenResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataUserResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/refesh-token")
public class RefeshTokenController {

    @Autowired
    JwtTokenHelper jwtTokenHelper;

    private Gson gson = new Gson();

    @PostMapping
    public ResponseEntity<?> refeshToken(@RequestParam("token") String token){
        DataResponse dataResponse = new DataResponse();

        if(jwtTokenHelper.validaToken(token)){
            String json = jwtTokenHelper.decodeTokenBuoiHoc(token);
            DataUserResponse dataUserResponse = gson.fromJson(json,DataUserResponse.class);

            if(StringUtils.hasText(dataUserResponse.getTypeToken()) && dataUserResponse.getTypeToken().equals("refesh")){
                UsernamePasswordAuthenticationToken authReq
                        = new UsernamePasswordAuthenticationToken("", "", new ArrayList<>());
                SecurityContext sc = SecurityContextHolder.getContext();
                sc.setAuthentication(authReq);

                DataTokenResponse dataTokenResponse = jwtTokenHelper.genaralToken(dataUserResponse);
                dataResponse.setStatus(HttpStatus.OK.value());
                dataResponse.setSuccess(true);
                dataResponse.setData(dataTokenResponse);
                dataResponse.setDesc("Login Success");
            }else {
                dataResponse.setStatus(HttpStatus.OK.value());
                dataResponse.setSuccess(true);
                dataResponse.setData(null);
                dataResponse.setDesc("Login faile");
            }
        }


        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }
}
