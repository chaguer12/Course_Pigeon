package com.example.demo.service;

import com.example.demo.model.Pigeon;

import java.util.List;
import java.util.Optional;

public interface PigeonServiceInterface {
    List<Pigeon> getAllPigeons();
    Optional<Pigeon> getPigeonById(long id);
    Pigeon savePigeon(Pigeon pigeon);
    void deletePigeon(long id);
}
