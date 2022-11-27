package com.example.vannt97.FoodDeliver.security;

import com.example.vannt97.FoodDeliver.entity.UserEntity;
import com.example.vannt97.FoodDeliver.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    LoginService loginService;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String password = authentication.getCredentials().toString();
        UserEntity user = loginService.checkLogin(email);

        if (user != null) {
            // use the credentials
            // and authenticate against the third-party system
            if(passwordEncoder.matches(password,user.getPassword())){
                return new UsernamePasswordAuthenticationToken(
                        user.getEmail(),user.getPassword(), new ArrayList<>());
            }else {
                return null;
            }

        } else {
            return null;
        }
    }

//    private boolean shouldAuthenticateAgainstThirdPartySystem() {
//        return true;
//    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
