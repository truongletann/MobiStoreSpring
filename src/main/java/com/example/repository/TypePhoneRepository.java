package com.example.repository;

import com.example.entity.TypePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePhoneRepository extends JpaRepository<TypePhone,Integer> {
}
