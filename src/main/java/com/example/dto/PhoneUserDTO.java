package com.example.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PhoneUserDTO {

    private int phoneID;
    @NotEmpty(message = "Please Enter Phone Name !")
    private String phoneName;
//    @Size(value=1, message= "whatever")
//    @Size(value = 1, message = "Please Enter Price !")
//    @NotBlank
    private float price;
    @NotEmpty(message = "Please Enter Description !")
    private String description;
    @NotEmpty(message = "Please Enter Manufacturer !")
    private String manufacturer;
//    @NotEmpty(message = "Please Enter Units In Stock !")
    private int quantity;
    private String imageFile;
    private String typeID;
    private String typeName;

    public PhoneUserDTO() {
    }

    public PhoneUserDTO(int phoneID, String phoneName, float price, String description, String manufacturer, int quantity, String imageFile, String typeID, String typeName) {
        this.phoneID = phoneID;
        this.phoneName = phoneName;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.imageFile = imageFile;
        this.typeID = typeID;
        this.typeName = typeName;
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

}
