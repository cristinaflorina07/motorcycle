package com.motorcycle.controller;

import com.motorcycle.entity.InregistrareUser;
import com.motorcycle.repository.InregistrareRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inregistrare")
public class InregistrareController {
    private final InregistrareRepository inregistrareRepository;

    public InregistrareController(InregistrareRepository inregistrareRepository) {
        this.inregistrareRepository = inregistrareRepository;
    }

    @PostMapping("/introducere")
    public InregistrareUser addInregistrare(@RequestBody InregistrareUser inregistrare) {
        return inregistrareRepository.save(inregistrare);
    }

    @GetMapping("/get")
    public List<InregistrareUser> findInregistrareaby() {
        return inregistrareRepository.findAll();
    }
}
