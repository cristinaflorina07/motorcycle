package com.motorcycle.controller;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.service.DatingUtilsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/time")
public class DatingUtilsController {
    private final DatingUtilsService datingUtilsService;


    public DatingUtilsController(DatingUtilsService datingUtilsService) {
        this.datingUtilsService = datingUtilsService;
    }
    @GetMapping
    public void calculateDays(){
        datingUtilsService.calculateDays();
    }
}
