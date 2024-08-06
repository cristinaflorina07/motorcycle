package com.motorcycle.repository;

import com.motorcycle.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
