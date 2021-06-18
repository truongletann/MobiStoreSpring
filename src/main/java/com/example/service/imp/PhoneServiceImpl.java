package com.example.service.imp;

import com.example.dto.PhoneDTO;
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
    public List<PhoneDTO> getAll() {
        List<PhoneDTO> dtos = new ArrayList<PhoneDTO>();
            List<Phone> entities = phoneRepository.findAll();
            for (Phone phone: entities) {
                dtos.add(new PhoneDTO(phone.getPhoneName()));
            }

        return dtos;

    }

//    public static void main(String[] args) {
//        PhoneServiceImpl ss= new PhoneServiceImpl();
//        System.out.println(ss.getAll().size());
//    }
}
