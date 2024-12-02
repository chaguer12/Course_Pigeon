package com.example.demo.service;

import com.example.demo.model.Resultat;

import java.util.List;
import java.util.Optional;

public interface ResultatServiceInterface {
    void deleteResultat(int id);
    Resultat saveResultat(Resultat resultat);
    List<Resultat> getAllResultats();
    void saveAllResultats(List<Resultat> resultats);
}
