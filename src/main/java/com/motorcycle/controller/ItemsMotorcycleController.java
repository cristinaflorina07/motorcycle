package com.motorcycle.controller;


import com.motorcycle.entity.ItemsMotorcycle;
import com.motorcycle.entity.Motorcycle;
import com.motorcycle.service.ItemsMotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/items")
@RestController
public class ItemsMotorcycleController {

    private final ItemsMotorcycleService itemsMotorcycleService;

    public ItemsMotorcycleController(ItemsMotorcycleService itemsMotorcycleService) {
        this.itemsMotorcycleService = itemsMotorcycleService;
    }

    @GetMapping("/getmotorcycleitem")
    public List<ItemsMotorcycle> getAllMotorcycleItems() {
        return itemsMotorcycleService.getAllItemsMotorcycle();
    }


    @PostMapping("/addmotorcycleitem")
    public ItemsMotorcycle addNewItemsMotorcycle(@RequestBody ItemsMotorcycle itemsMotorcycle) {
        return itemsMotorcycleService.addNewItemsMotorcycle(itemsMotorcycle);
    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteItemsMotorcycleById(@PathVariable Long id) {
//        itemsMotorcycleService.deleteItemsMotorcycleById(id);
//    }


//    @GetMapping("/get/{id}")
//    public Optional<ItemsMotorcycle> findItemsMotorcycleById(@PathVariable Long id) {
//        return itemsMotorcycleService.findItemsMotorcycleById(id);
//    }
}

