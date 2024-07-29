package com.motorcycle.repository;

import com.motorcycle.entity.InregistrareUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InregistrareRepository extends JpaRepository<InregistrareUser, Long> {
}
