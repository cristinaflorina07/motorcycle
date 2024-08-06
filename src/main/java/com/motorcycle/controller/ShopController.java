package com.motorcycle.controller;


import com.motorcycle.entity.Shop;
import com.motorcycle.service.ShopService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/shop")
@RestController
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @PostMapping("/add")
    public Shop addShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }
}
