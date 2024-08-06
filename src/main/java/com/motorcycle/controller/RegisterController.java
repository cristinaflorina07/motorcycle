package com.motorcycle.controller;

import com.motorcycle.entity.RegisterUser;
import com.motorcycle.service.RegisterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inregistrare")
public class RegisterController {
    private final RegisterService inregistrareService;

    public RegisterController(RegisterService inregistrareService) {
        this.inregistrareService = inregistrareService;
    }



    @PostMapping("/introducere")
    public RegisterUser addInregistrare(@RequestBody RegisterUser inregistrare) {
        return inregistrareService.addInregistrare(inregistrare);
    }

    @GetMapping("/get")
    public List<RegisterUser> findInregistrareaby() {

    return inregistrareService.findInregistrareaby();
    }
}
