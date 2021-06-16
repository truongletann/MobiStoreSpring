package com.example.controller.user;

import com.example.dto.PhoneDTO;
import com.example.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user/phone")
public class UserPhoneController {

    @Autowired
    PhoneService phoneService;

    @GetMapping("")
    public Object get(){
        try {
            List<PhoneDTO> listPhone = phoneService.getAll();
            return new ResponseEntity<Object>(HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}