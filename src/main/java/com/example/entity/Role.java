package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblrole")
public class Role {

    @Id
    private String roleID;
    private String roleName;

    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
    private List<User> users;

    public Role() {
    }

    public Role(String roleID, String roleName, List<User> users) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.users = users;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
