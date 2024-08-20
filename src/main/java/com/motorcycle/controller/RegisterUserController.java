package com.motorcycle.controller;

import com.motorcycle.entity.RegisterUser;
import com.motorcycle.service.RegisterUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/register")
public class RegisterUserController {
    private final RegisterUserService registerService;

    public RegisterUserController(RegisterUserService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/get")
    public List<RegisterUser> getAllUsers() {
        return registerService.getAllUsers();
    }

    @PostMapping("/add")
    public RegisterUser addUser(@RequestBody RegisterUser registerUser) {
        return registerService.addNewUser(registerUser);
    }

    @GetMapping("/get/{id}")
    public Optional<RegisterUser> findRegisterUserById(@PathVariable Long id) {
        return registerService.findRegisterUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRegisterUserById(@PathVariable Long id) {
        registerService.deleteRegisterById(id);
    }
}
