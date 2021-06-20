package com.example.repository;

import com.example.dto.PhoneUserDTO;
import com.example.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional(rollbackOn = Exception.class)
public interface PhoneRepository extends JpaRepository<Phone,Integer> {

    @Query("SELECT new com.example.dto.PhoneUserDTO(p.phoneID, p.phoneName, p.price, p.description, p.manufacturer, " +
            "p.quantity, p.imageFile, p.typeID, tp.typeName) " +
            "FROM Phone p JOIN TypePhone tp on p.typeID = tp.typeID where p.isDelete = true")
    List<PhoneUserDTO> getAllPhoneUser();

    @Query("SELECT new com.example.dto.PhoneUserDTO(p.phoneID, p.phoneName, p.price, p.description, p.manufacturer, " +
            "p.quantity, p.imageFile, p.typeID, tp.typeName) " +
            "FROM Phone p JOIN TypePhone tp on p.typeID = tp.typeID where p.isDelete = true and p.phoneID = ?1")
    PhoneUserDTO getPhoneUserDetail(int phoneID);

    @Query("Update Phone set quantity = quantity - ?1 where phoneID = ?2")
    int updateQuantityPhone(int quantity,int phoneID);

}
