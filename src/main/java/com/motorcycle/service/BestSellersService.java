package com.motorcycle.service;

import com.motorcycle.entity.BestSellers;
import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.BestSellersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class BestSellersService {

    private final BestSellersRepository bestSellersRepository;

    public BestSellersService(BestSellersRepository bestSellersRepository) {
        this.bestSellersRepository = bestSellersRepository;
    }

    public List<BestSellers> getLevelSallers() {
        return bestSellersRepository.findAll();
    }

    public BestSellers addLevelSellers(BestSellers bestSellers) {
        return bestSellersRepository.save(bestSellers);
    }

    public Optional<BestSellers> findBestSellersBy(Long id) {
        return bestSellersRepository.findById(id);
    }

    public void deleteById(Long id){

        bestSellersRepository.deleteById(id);
    }
}

