package com.example.service;

import com.example.dto.PhoneUserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PhoneService {
    List<PhoneUserDTO> getAllPhoneUser();
    PhoneUserDTO getPhoneUserDetail(int phoneID);
    void add(PhoneUserDTO dto);
//    void add(PhoneUserDTO dto, MultipartFile file);
}
