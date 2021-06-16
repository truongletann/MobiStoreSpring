package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblOrderDetail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailID;
    private int orderID;
    private int phoneID;
    private int quantity;
    private float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderID", insertable = false, updatable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phoneID", insertable = false, updatable = false)
    private Phone phone;

    public OrderDetail() {
    }

    public OrderDetail(int detailID, int orderID, int phoneID, int quantity, float price, Order order, Phone phone) {
        this.detailID = detailID;
        this.orderID = orderID;
        this.phoneID = phoneID;
        this.quantity = quantity;
        this.price = price;
        this.order = order;
        this.phone = phone;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
