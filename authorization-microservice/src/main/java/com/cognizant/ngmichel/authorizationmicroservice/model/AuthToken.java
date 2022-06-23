package com.cognizant.ngmichel.authorizationmicroservice.model;

public class AuthToken {

    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    public AuthToken(){}

    public String getToken() {
        return token;
    }
}
