package com.example.controller;

import com.example.dto.PhoneUserDTO;
import com.example.dto.TypePhoneDTO;
import com.example.service.PhoneService;
import com.example.service.TypePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typePhone")
public class TypePhoneController {

    @Autowired
    TypePhoneService phoneTypeService;

    @GetMapping("")
    public Object get(){
        try {
            List<TypePhoneDTO> listTypePhone = phoneTypeService.getAll();
            return new ResponseEntity<Object>(listTypePhone, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
