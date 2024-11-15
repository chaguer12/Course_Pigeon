package com.example.demo.service.impl;

import com.example.demo.model.Pigeon;
import com.example.demo.model.enums.Sexe;
import com.example.demo.repository.PigeonRepository;
import com.example.demo.service.PigeonServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        if(pigeon.getSexe() == Sexe.F){
            pigeon.setRingNumber(String.valueOf(Sexe.F)+"-"+UUID.randomUUID());
        }else {
            pigeon.setRingNumber(String.valueOf(Sexe.M)+"-"+ UUID.randomUUID());
        }
        System.out.println(pigeon.getRingNumber());
        return pigeonRepository.save(pigeon);
    }
    @Override
    public void deletePigeon(String id) {
        pigeonRepository.deleteById(id);
    }
}
