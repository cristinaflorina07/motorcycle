package com.motorcycle.repository;

import com.motorcycle.entity.BestSellers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestSellersRepository extends JpaRepository<BestSellers,Long> {
}
