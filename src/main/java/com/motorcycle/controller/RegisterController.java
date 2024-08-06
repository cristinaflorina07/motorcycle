package com.motorcycle.controller;

import com.motorcycle.entity.RegisterUser;
import com.motorcycle.service.RegisterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
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
}
