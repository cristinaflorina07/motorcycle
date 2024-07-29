package com.motorcycle.controller;

import com.motorcycle.entity.BestSellers;
import com.motorcycle.repository.BestSellersRepository;
import com.motorcycle.service.BestSellersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bestSellers")
public class BestSallersController {
    private final BestSellersService bestSellersService;

    public BestSallersController(BestSellersService bestSellersService) {
        this.bestSellersService = bestSellersService;
    }


    @GetMapping("/get")
    public List<BestSellers> getLevelSallers() {
        return bestSellersService.getLevelSallers();
    }

    @PostMapping("/introducere")
    public BestSellers addLevelSellers(@RequestBody BestSellers bestSellers) {
        return bestSellersService.addLevelSellers(bestSellers);
    }
}
