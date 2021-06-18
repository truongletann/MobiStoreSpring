package com.example.service.imp;

import com.example.dto.PhoneUserDTO;
import com.example.entity.Phone;
import com.example.repository.PhoneRepository;
import com.example.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;


    @Override
    public List<PhoneUserDTO> getAll() {
        List<PhoneUserDTO> dtos = phoneRepository.getPhoneUser();
        return dtos;
    }

//    public static void main(String[] args) {
//        PhoneServiceImpl ss= new PhoneServiceImpl();
//        System.out.println(ss.getAll().size());
//    }
}
