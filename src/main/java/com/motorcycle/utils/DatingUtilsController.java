package com.motorcycle.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
