package com.motorcycle.controller;


import com.motorcycle.entity.ItemsCar;
import com.motorcycle.service.ItemsCarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/items")
@RestController
public class ItemsCarController {

    private final ItemsCarService itemsCarService;

    public ItemsCarController(ItemsCarService itemsCarService) {
        this.itemsCarService = itemsCarService;
    }

    @GetMapping("/getcaritems")
    public List<ItemsCar> getAllItemsCar() {
        return itemsCarService.getAllItemsCar();
    }

    @PostMapping("/addcaritem")
    public ItemsCar addCarItem(@RequestBody ItemsCar itemsCar) {
        return itemsCarService.addItems(itemsCar);
    }

    @GetMapping("/get/{id}")
    public Optional<ItemsCar> findItemsCarById(@PathVariable Long id) {
        return itemsCarService.findItemsCarById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItemsCarById(@PathVariable Long id) {
        itemsCarService.deleteItemsCarById(id);
    }
}
