package com.example.service.imp;

import com.example.dto.TypePhoneDTO;
import com.example.entity.TypePhone;
import com.example.repository.TypePhoneRepository;
import com.example.service.TypePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TypePhoneServiceImpl implements TypePhoneService {

    @Autowired
    private TypePhoneRepository typePhoneRepository;

    @Override
    public List<TypePhoneDTO> getAll() {
        List<TypePhone> entities = typePhoneRepository.findAll();
        List<TypePhoneDTO> dtos = new ArrayList<TypePhoneDTO>();

        for (TypePhone entity : entities) {
            dtos.add(new TypePhoneDTO(entity.getTypeID(), entity.getTypeName()));
        }
        return dtos;
    }
}
