package com.example.dto;

import javax.validation.constraints.NotEmpty;

public class LoginDTO {

    @NotEmpty(message = "Please enter your email !")
    private String userID;

    @NotEmpty(message = "Please enter your password !")
    private String password;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
