package com.example.vannt97.FoodDeliver.jwt;

import com.example.vannt97.FoodDeliver.payload.response.DataTokenResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataUserResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {
    @Autowired
    JwtTokenHelper jwtTokenHelper;

    private Gson gson = new Gson();


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = getTokenFromHeader(request);
        if(token != null){
            if(jwtTokenHelper.validaToken(token)){

                String json = jwtTokenHelper.decodeTokenBuoiHoc(token);
                DataUserResponse dataUserResponse = gson.fromJson(json,DataUserResponse.class);

                if(StringUtils.hasText(dataUserResponse.getTypeToken()) && !dataUserResponse.getTypeToken().equals("refesh")){
                    UsernamePasswordAuthenticationToken authReq
                            = new UsernamePasswordAuthenticationToken("", "", new ArrayList<>());
                    SecurityContext sc = SecurityContextHolder.getContext();
                    sc.setAuthentication(authReq);
                }
            }
        }
        filterChain.doFilter(request,response);

    }

    private String getTokenFromHeader(HttpServletRequest request){
        String strHasToken = request.getHeader("Authorization");
        if(StringUtils.hasText(strHasToken) && strHasToken.startsWith("Bearer ")){
            String finalToken = strHasToken.substring(7);
            return finalToken;
        }
        return null;
    }
}
