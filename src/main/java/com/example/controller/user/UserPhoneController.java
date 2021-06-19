package com.example.controller.user;

import com.example.dto.PhoneUserDTO;
import com.example.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user/phone")
public class UserPhoneController {

    @Autowired
    PhoneService phoneService;

    @GetMapping("")
    public Object get(){
        try {
            List<PhoneUserDTO> listPhone = phoneService.getAllPhoneUser();
            return new ResponseEntity<Object>(listPhone, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("{phoneID}")
    public Object get(@PathVariable int phoneID) {
        try {
            PhoneUserDTO phone = phoneService.getPhoneUserDetail(phoneID);
            return new ResponseEntity<Object>(phone, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);

        }
    }

    @PostMapping("")
    public Object post(@Valid @RequestBody PhoneUserDTO phoneUserDTO) {
        try {
            phoneService.add(phoneUserDTO);
            return new ResponseEntity<Object>(HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);

        }
    }

//    @PostMapping("")
//    public Object post(@RequestParam MultipartFile file,@Valid @RequestBody PhoneUserDTO phoneUserDTO) {
//        try {
//            phoneService.add(phoneUserDTO,file);
//            return new ResponseEntity<Object>(HttpStatus.CREATED);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
//
//        }
//    }
}
