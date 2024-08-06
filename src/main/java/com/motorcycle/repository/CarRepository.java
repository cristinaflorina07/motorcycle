package com.motorcycle.repository;

import com.motorcycle.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {


    }

