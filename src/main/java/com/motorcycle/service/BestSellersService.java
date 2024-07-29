package com.motorcycle.service;

import com.motorcycle.entity.BestSellers;
import com.motorcycle.repository.BestSellersRepository;
import com.motorcycle.utils.LevelSellers;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class BestSellersService {

    private BestSellersRepository bestSellersRepository;

    public BestSellersService(BestSellersRepository bestSellersRepository) {
        this.bestSellersRepository = bestSellersRepository;
    }
    public List<BestSellers> getLevelSallers() {
        return bestSellersRepository.findAll();
    }
    public BestSellers addLevelSellers(BestSellers bestSellers) {
        return bestSellersRepository.save(bestSellers);
}
}

