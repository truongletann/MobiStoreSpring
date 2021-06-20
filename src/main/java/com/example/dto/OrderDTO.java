package com.example.dto;


import java.util.Date;
import java.util.List;

public class OrderDTO {
    private int orderID;
    private String userID;
    private float totalPrice;
    private Date dateBuy;
    private List<OrderDetailDTO> listOrderDetailDTO;



    public OrderDTO() {
    }

    public OrderDTO(int orderID, String userID, float totalPrice, Date dateBuy) {
        this.orderID = orderID;
        this.userID = userID;
        this.totalPrice = totalPrice;
        this.dateBuy = dateBuy;
    }

    public OrderDTO(int orderID, String userID, float totalPrice, Date dateBuy, List<OrderDetailDTO> listOrderDetailDTO) {
        this.orderID = orderID;
        this.userID = userID;
        this.totalPrice = totalPrice;
        this.dateBuy = dateBuy;
        this.listOrderDetailDTO = listOrderDetailDTO;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }
    public List<OrderDetailDTO> getListOrderDetailDTO() {
        return listOrderDetailDTO;
    }

    public void setListOrderDetailDTO(List<OrderDetailDTO> listOrderDetailDTO) {
        this.listOrderDetailDTO = listOrderDetailDTO;
    }
}
