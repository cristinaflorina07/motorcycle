package com.motorcycle.controller;


import com.motorcycle.entity.ItemsCar;
import com.motorcycle.service.ItemsCarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
