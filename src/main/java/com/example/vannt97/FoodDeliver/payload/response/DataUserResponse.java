package com.example.vannt97.FoodDeliver.payload.response;

public class DataUserResponse {
    private String email;
    private String fullname;
    private String phoneNumber;
    private String typeToken;

    public DataUserResponse() {
    }

    public DataUserResponse( String email, String fullname, String phoneNumber) {
        this.email = email;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
    }

    public DataUserResponse(String email, String fullname, String phoneNumber, String typeToken) {
        this.email = email;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.typeToken = typeToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTypeToken() {
        return typeToken;
    }

    public void setTypeToken(String typeToken) {
        this.typeToken = typeToken;
    }
}
