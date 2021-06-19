package com.example.service.imp;

import com.example.dto.PhoneUserDTO;
import com.example.entity.Phone;
import com.example.repository.PhoneRepository;
import com.example.service.FileService;
import com.example.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    private FileService fileService;

    @Override
    public List<PhoneUserDTO> getAllPhoneUser() {
        List<PhoneUserDTO> dtos = phoneRepository.getAllPhoneUser();
        return dtos;
    }

    @Override
    public PhoneUserDTO getPhoneUserDetail(int phoneID) {
        PhoneUserDTO dtos =phoneRepository.getPhoneUserDetail(phoneID);
        return dtos;
    }

    @Override
    public void add(PhoneUserDTO dto) {
        if(dto == null){
            return;
        }
        phoneRepository.save(new Phone(
                dto.getPhoneName(),
                dto.getPrice(),
                dto.getDescription(),
                dto.getManufacturer(),
                dto.getQuantity(),
                dto.getImageFile(),
                dto.getTypeID(),true));
    }

//    @Override
//    public void add(PhoneUserDTO dto, MultipartFile file) {
//        if(dto == null || file.isEmpty()){
//            return;
//        }
//        String imageFile = fileService.saveFile(file);
//        phoneRepository.save(new Phone(
//                dto.getPhoneName(),
//                dto.getPrice(),
//                dto.getDescription(),
//                dto.getManufacturer(),
//                dto.getQuantity(),
//                imageFile,
//                dto.getTypeID(),true));
//    }


}
