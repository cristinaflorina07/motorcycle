package com.motorcycle.service;

import com.motorcycle.entity.RegisterUser;
import com.motorcycle.repository.RegisterUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterUserService {

    private final RegisterUserRepository registerUserRepository;

    public RegisterUserService(RegisterUserRepository registerUserRepository) {
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
    public void deleteRegisterById(Long id){
        registerUserRepository.deleteById(id);
    }
}
