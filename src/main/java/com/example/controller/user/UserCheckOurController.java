package com.example.controller.user;

import com.example.dto.OrderDTO;
import com.example.dto.PhoneUserDTO;
import com.example.service.CheckOutService;
import com.example.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/pay")
@Transactional(rollbackOn = Exception.class)
public class UserCheckOurController {

    @Autowired
    CheckOutService checkOutService;

    @PostMapping("")
    public Object post(@Valid @RequestBody OrderDTO orderDTO) {
        try {
            checkOutService.checkOut(orderDTO);
            return new ResponseEntity<Object>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);

        }
    }
}
