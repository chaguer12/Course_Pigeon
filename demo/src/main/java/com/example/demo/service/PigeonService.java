package com.example.demo.service;

import com.example.demo.model.Pigeon;
import com.example.demo.repository.PigeonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PigeonService {

    @Autowired
    private PigeonRepository pigeonRepository;

    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }

    public Optional<Pigeon> getPigeonById(int id) {
        return pigeonRepository.findById((long)id);
    }

    public Pigeon savePigeon(Pigeon pigeon) {
        return pigeonRepository.save(pigeon);
    }

    public void deletePigeon(long id) {
        pigeonRepository.deleteById(id);
    }
}
