package com.motorcycle.controller;

import com.motorcycle.entity.BestSellers;
import com.motorcycle.service.BestSellersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bestsellers")
public class BestSellerController {
    private final BestSellersService bestSellersService;

    public BestSellerController(BestSellersService bestSellersService) {
        this.bestSellersService = bestSellersService;
    }


    @GetMapping("/get")
    public List<BestSellers> getLevelSellers() {
        return bestSellersService.getLevelSallers();
    }

    @GetMapping("/findById/{id}")
    public Optional<BestSellers> findBestSellersById(@PathVariable Long id) {
        return bestSellersService.findBestSellersById(id);
    }

    @PostMapping("/add")
    public BestSellers addLevelSellers(@RequestBody BestSellers bestSellers) {
        return bestSellersService.addLevelSellers(bestSellers);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        bestSellersService.deleteById(id);
    }

}
