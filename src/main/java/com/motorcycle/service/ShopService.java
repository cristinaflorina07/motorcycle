package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.entity.Shop;
import com.motorcycle.repository.ShopRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public Shop addShop(Shop shop) {
       return shopRepository.save(shop);
    }
}
