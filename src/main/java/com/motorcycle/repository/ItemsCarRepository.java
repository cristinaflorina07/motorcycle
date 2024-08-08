package com.motorcycle.repository;

import com.motorcycle.entity.Items;
import com.motorcycle.entity.ItemsCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsCarRepository extends JpaRepository<ItemsCar, Long> {

}
