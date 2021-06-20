package com.example.service.imp;

import com.example.dto.OrderDTO;
import com.example.dto.OrderDetailDTO;
import com.example.entity.Order;
import com.example.entity.OrderDetail;
import com.example.repository.OrderDetailRepository;
import com.example.repository.OrderRepository;
import com.example.repository.PhoneRepository;
import com.example.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
public class CheckOutServiceImpl implements CheckOutService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PhoneRepository phoneRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Override
    public void checkOut(OrderDTO orderDTO) {
        if(orderDTO == null || orderDTO.getListOrderDetailDTO().isEmpty()){
            return;
        }
        int random_int = 0;
        do{
            random_int = (int)(Math.random() * (1000000 - 1 + 1) + 1);
        }while(orderRepository.findById(random_int) != null);
        orderRepository.saveAndFlush(new Order(
                random_int,
                orderDTO.getUserID(),
                orderDTO.getTotalPrice(),
                orderDTO.getDateBuy()
        ));
        boolean check = true;
        List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        for (OrderDetailDTO dto : orderDTO.getListOrderDetailDTO()) {
            if(dto.getQuantity() < phoneRepository.findById(dto.getPhoneID()).get().getQuantity())
                check = false;
            else
                orderDetails.add(new OrderDetail(
                        random_int,
                        dto.getPhoneID(),
                        dto.getQuantity(),
                        dto.getPrice()
                ));
        }
        if(check == false)
            return;
        else
            for (OrderDetail orderDetail: orderDetails) {
                orderDetailRepository.saveAndFlush(orderDetail);
                phoneRepository.updateQuantityPhone(orderDetail.getQuantity(),orderDetail.getPhoneID());
            }

    }
}
