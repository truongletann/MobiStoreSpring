package com.example.dto;

public class RoleDTO {
    private String roleID;
    private int roleName;

    public RoleDTO() {
    }

    public RoleDTO(String roleID, int roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public int getRoleName() {
        return roleName;
    }

    public void setRoleName(int roleName) {
        this.roleName = roleName;
    }
}
