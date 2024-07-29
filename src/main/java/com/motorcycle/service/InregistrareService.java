package com.motorcycle.service;

import com.motorcycle.entity.InregistrareUser;
import com.motorcycle.repository.InregistrareRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class InregistrareService {

    private InregistrareRepository inregistrareRepository;

    @Transactional
    public void createDate() {
        InregistrareUser inregistrare = new InregistrareUser();
        inregistrare.setUsername("Cristina07");
        inregistrare.setPassword("daffds");
        inregistrareRepository.save(inregistrare);
    }
}
