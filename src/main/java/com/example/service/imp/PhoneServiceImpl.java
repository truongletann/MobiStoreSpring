package com.example.service.imp;

import com.example.dto.PhoneDTO;
import com.example.entity.Phone;
import com.example.repository.PhoneRepository;
import com.example.service.PhoneService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    private PhoneRepository phoneRepository;

    public PhoneServiceImpl(PhoneRepository phoneRepository){
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<PhoneDTO> getAll() {
        List<PhoneDTO> dtos = new ArrayList<PhoneDTO>();
        try {
            List<Phone> entities = phoneRepository.findAll();
            for (Phone phone: entities) {
                dtos.add(new PhoneDTO(phone.getPhoneName()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dtos;

    }
}
