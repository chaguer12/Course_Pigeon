package com.example.demo.service.impl;

import com.example.demo.model.Pigeon;
import com.example.demo.repository.PigeonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PigeonService {


    private final PigeonRepository pigeonRepository;

    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }

    public Optional<Pigeon> getPigeonById(long id) {
        return pigeonRepository.findById(id);
    }

    public Pigeon savePigeon(Pigeon pigeon) {
        return pigeonRepository.save(pigeon);
    }

    public void deletePigeon(long id) {
        pigeonRepository.deleteById(id);
    }
}
