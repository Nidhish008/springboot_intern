package com.example.Springboot.repository;

import com.example.Springboot.model.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails,Integer> {
    RegisterDetails findByEmail(String email);
}

