package com.example.demo.service;

import com.example.demo.model.Pigeon;

import java.util.List;
import java.util.Optional;

public interface PigeonServiceInterface {
    void deletePigeon(String id);
    Pigeon savePigeon(Pigeon pigeon);
    Optional<Pigeon> getPigeonById(String id);
    List<Pigeon> getAllPigeons();
}
