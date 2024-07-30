package com.motorcycle.repository;

import com.motorcycle.entity.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterUserRepository extends JpaRepository<RegisterUser, Long> {
}
