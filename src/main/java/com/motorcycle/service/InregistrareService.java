package com.motorcycle.service;

import com.motorcycle.entity.InregistrareUser;
import com.motorcycle.repository.InregistrareRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class InregistrareService {

    private final InregistrareRepository inregistrareRepository;

    public InregistrareService(InregistrareRepository inregistrareRepository) {
        this.inregistrareRepository = inregistrareRepository;
    }

    public InregistrareUser addInregistrare(InregistrareUser inregistrare) {
        return inregistrareRepository.save(inregistrare);

    }

    public List<InregistrareUser> findInregistrareaby() {
        return inregistrareRepository.findAll();
    }
}
