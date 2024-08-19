package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.entity.RegisterUser;
import com.motorcycle.repository.RegisterUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {

    private final RegisterUserRepository registerUserRepository;

    public RegisterService(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    public RegisterUser addNewUser(RegisterUser registerUser) {
        return registerUserRepository.save(registerUser);

    }

    public List<RegisterUser> getAllUsers() {
        return registerUserRepository.findAll();
    }

    public Optional<RegisterUser> findRegisterUserById(Long id) {
        return registerUserRepository.findById(id);
    }
}
