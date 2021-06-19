package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblPhones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneID;
    private String phoneName;
    private float price;
    private String description;
    private String manufacturer;
    private int quantity;
    private String imageFile;
    private String typeID;
    private boolean isDelete;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeID",insertable = false,updatable = false)
    private TypePhone typePhone;

    @OneToMany(mappedBy = "phone",fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;

    public Phone() {
    }

    public Phone(int phoneID, String phoneName, float price, String description, String manufacturer, int quantity, String imageFile, String typeID, boolean isDelete) {
        this.phoneID = phoneID;
        this.phoneName = phoneName;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.imageFile = imageFile;
        this.typeID = typeID;
        this.isDelete = isDelete;
    }

    public Phone(String phoneName, float price, String description, String manufacturer, int quantity, String imageFile, String typeID, boolean isDelete) {
        this.phoneName = phoneName;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.imageFile = imageFile;
        this.typeID = typeID;
        this.isDelete = isDelete;
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

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public TypePhone getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
