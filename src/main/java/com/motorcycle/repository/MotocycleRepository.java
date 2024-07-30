package com.motorcycle.repository;

import com.motorcycle.entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotocycleRepository extends JpaRepository<Motorcycle,Long> {
}

