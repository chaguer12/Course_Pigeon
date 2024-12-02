package com.example.demo.service.impl;

import com.example.demo.model.Resultat;
import com.example.demo.repository.ResultatRepository;
import com.example.demo.service.ResultatServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class ResultatService implements ResultatServiceInterface {


    private ResultatRepository resultatRepository;

    @Autowired
    public ResultatService(ResultatRepository resultatRepository) {
        this.resultatRepository = resultatRepository;
    }

    @Override
    public void deleteResultat(String id) {
        resultatRepository.deleteById(id);
    }

    @Override
    public Resultat saveResultat(Resultat resultat) {
        return resultatRepository.save(resultat);
    }

    @Override
    public List<Resultat> getAllResultats() {
       return resultatRepository.findAll();
    }

    @Override
    public void saveAllResultats(List<Resultat> resultats) {
        resultatRepository.saveAll(resultats); // Batch save all resultats
    }
}
