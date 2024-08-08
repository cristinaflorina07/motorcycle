package com.motorcycle.controller;


import com.motorcycle.entity.ItemsMotorcycle;
import com.motorcycle.service.ItemsMotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/items")
@RestController
public class ItemsMotorcycleController {

    private final ItemsMotorcycleService itemsMotorcycleService;

    public ItemsMotorcycleController(ItemsMotorcycleService itemsMotorcycleService) {
        this.itemsMotorcycleService = itemsMotorcycleService;
    }

    @GetMapping("/getmotorcycleitem")
    public List<ItemsMotorcycle> getAllMotorcycleItems() {
        return itemsMotorcycleService.getAllMotorcycleItems();
    }


    @PostMapping("/addmotorcycleitem")
    public ItemsMotorcycle addNewMotorcycleItem(@RequestBody ItemsMotorcycle itemsMotorcycle) {
        return itemsMotorcycleService.addNewMotorcycleItem(itemsMotorcycle);
    }
}
