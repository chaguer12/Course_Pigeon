package com.example.demo.service.impl;

import com.example.demo.model.Pigeon;
import com.example.demo.repository.PigeonRepository;
import com.example.demo.service.PigeonServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PigeonService implements PigeonServiceInterface {


    private final PigeonRepository pigeonRepository;
    @Override
    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }
    @Override
    public Optional<Pigeon> getPigeonById(String id) {
        return pigeonRepository.findById(id);
    }
    @Override
    public Pigeon savePigeon(Pigeon pigeon) {
        return pigeonRepository.save(pigeon);
    }
    @Override
    public void deletePigeon(String id) {
        pigeonRepository.deleteById(id);
    }
}
