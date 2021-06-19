package com.example.dto;

public class TypePhoneDTO {
    private String typePhoneID;
    private String typePhoneName;

    public TypePhoneDTO() {
    }

    public TypePhoneDTO(String typePhoneID, String typePhoneName) {
        this.typePhoneID = typePhoneID;
        this.typePhoneName = typePhoneName;
    }

    public String getTypePhoneID() {
        return typePhoneID;
    }

    public void setTypePhoneID(String typePhoneID) {
        this.typePhoneID = typePhoneID;
    }

    public String getTypePhoneName() {
        return typePhoneName;
    }

    public void setTypePhoneName(String typePhoneName) {
        this.typePhoneName = typePhoneName;
    }
}
