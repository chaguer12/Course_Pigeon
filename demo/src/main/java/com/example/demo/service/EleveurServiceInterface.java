package com.example.demo.service;

import com.example.demo.model.Eleveur;

import java.util.List;

public interface EleveurServiceInterface {

    Eleveur getEleveurById(String id);
    List<Eleveur> getAllEleveur();
    Eleveur saveEleveur(Eleveur eleveur);
    Eleveur updateEleveur(Eleveur eleveur);
    void deleteEleveur(String id);
}
