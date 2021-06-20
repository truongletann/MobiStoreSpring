package com.example.dto;

public class OrderDetailDTO {
    private int detailID;
    private int orderID;
    private int phoneID;
    private int quantity;
    private float price;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int detailID, int orderID, int phoneID, int quantity, float price) {
        this.detailID = detailID;
        this.orderID = orderID;
        this.phoneID = phoneID;
        this.quantity = quantity;
        this.price = price;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
