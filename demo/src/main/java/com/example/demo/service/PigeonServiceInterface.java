package com.example.demo.service;

import com.example.demo.model.Pigeon;

import java.util.List;
import java.util.Optional;

public interface PigeonServiceInterface {
    List<Pigeon> getAllPigeons();
    Optional<Pigeon> getPigeonById(String id);
    Pigeon savePigeon(Pigeon pigeon);
    void deletePigeon(String id);
}
