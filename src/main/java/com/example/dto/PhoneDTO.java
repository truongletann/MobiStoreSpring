package com.example.dto;

import javax.validation.constraints.NotEmpty;

public class PhoneDTO {

    private int phoneID;
//    @NotEmpty(message = "Please enter phone name !")
    private String phoneName;
    private float price;
    private String uniStock;
    private String description;
    private String manufacturer;
    private String condition;
    private int quantity;
    private String imageFile;
    private String typeID;
    private String typeNameName;
    private boolean isDelete;

    public PhoneDTO() {
    }

    public PhoneDTO(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUniStock() {
        return uniStock;
    }

    public void setUniStock(String uniStock) {
        this.uniStock = uniStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getTypeNameName() {
        return typeNameName;
    }

    public void setTypeNameName(String typeNameName) {
        this.typeNameName = typeNameName;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
