package com.example.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserDetailDTO extends User implements UserDetails {
    private String userID;
    private String fullName;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserDetailDTO(String userID, String password, String fullName, Collection<? extends GrantedAuthority> authorities) {
        super(fullName, password, authorities);
        this.fullName = fullName;
        this.userID = userID;
        // TODO Auto-generated constructor stub
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
