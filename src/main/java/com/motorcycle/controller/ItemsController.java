package com.motorcycle.controller;


import com.motorcycle.entity.Items;
import com.motorcycle.service.ItemsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/items")
@RestController
public class ItemsController {

    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }


    @PostMapping("/add")
    public Items addItems(@RequestBody Items item) {
        return itemsService.addItems(item);
    }
}
