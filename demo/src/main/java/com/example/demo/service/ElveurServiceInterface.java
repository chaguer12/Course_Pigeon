package com.example.demo.service;

import com.example.demo.model.Eleveur;

import java.util.List;

public interface ElveurServiceInterface {
    Eleveur getEleveurById(long id);
    List<Eleveur> getAllEleveur();
    Eleveur saveEleveur(Eleveur eleveur);
    Eleveur updateEleveur(Eleveur eleveur);
    void deleteEleveur(int id);
}
