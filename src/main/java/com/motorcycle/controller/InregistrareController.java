package com.motorcycle.controller;

import com.motorcycle.entity.InregistrareUser;
import com.motorcycle.repository.InregistrareRepository;
import com.motorcycle.service.InregistrareService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inregistrare")
public class InregistrareController {
    private final InregistrareService inregistrareService;

    public InregistrareController(InregistrareService inregistrareService) {
        this.inregistrareService = inregistrareService;
    }



    @PostMapping("/introducere")
    public InregistrareUser addInregistrare(@RequestBody InregistrareUser inregistrare) {
        return inregistrareService.addInregistrare(inregistrare);
    }

    @GetMapping("/get")
    public List<InregistrareUser> findInregistrareaby() {

    return inregistrareService.findInregistrareaby();
    }
}
