package com.example.controller;

import com.example.dto.LoginDTO;
import com.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("login")
    public  Object post(@Valid @RequestBody LoginDTO account){
        try {
            String token = authService.login(account);
            return new ResponseEntity<Object>(token, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
