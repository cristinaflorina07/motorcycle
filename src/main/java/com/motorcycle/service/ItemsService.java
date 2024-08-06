package com.motorcycle.service;

import com.motorcycle.entity.Items;
import com.motorcycle.repository.ItemsRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {

    private final ItemsRepository itemsRepository;

    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public Items addItems(Items items) {
        return itemsRepository.save(items);
    }
}
