package com.example.entity;

import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblUsers")
public class User {
    @Id
    private String userID;
    private String fullName;
    private String password;
    private String roleID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleID", insertable = false, updatable = false)
    private Role role;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Order> order;


    public User() {
    }

    public User(String userID, String fullName, String password, String roleID, Role role) {
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
        this.roleID = roleID;
        this.role = role;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
