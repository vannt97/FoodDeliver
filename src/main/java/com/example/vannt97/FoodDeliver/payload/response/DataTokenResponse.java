package com.example.vannt97.FoodDeliver.payload.response;

import java.util.Date;

public class DataTokenResponse {
    private String token;
    private Date create_at;
    private Date expiredDate;
    private String refeshToken;


    public DataTokenResponse(String token, Date create_at, Date expiredDate, String refeshToken) {
        this.token = token;
        this.create_at = create_at;
        this.expiredDate = expiredDate;
        this.refeshToken = refeshToken;
    }

    public String getRefeshToken() {
        return refeshToken;
    }

    public void setRefeshToken(String refeshToken) {
        this.refeshToken = refeshToken;
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

}
