package com.motorcycle.service;

import com.motorcycle.entity.RegisterUser;
import com.motorcycle.repository.RegisterUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    private final RegisterUserRepository inregistrareRepository;

    public RegisterService(RegisterUserRepository inregistrareRepository) {
        this.inregistrareRepository = inregistrareRepository;
    }

    public RegisterUser addInregistrare(RegisterUser inregistrare) {
        return inregistrareRepository.save(inregistrare);

    }

    public List<RegisterUser> findInregistrareaby() {
        return inregistrareRepository.findAll();
    }
}
