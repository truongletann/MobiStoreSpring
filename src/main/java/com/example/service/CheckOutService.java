package com.example.service;

import com.example.dto.OrderDTO;
import com.example.dto.OrderDetailDTO;

import java.util.List;

public interface CheckOutService {
    void checkOut(OrderDTO orderDTO);
}
