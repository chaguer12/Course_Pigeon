package com.example.demo.service;


import com.example.demo.model.Eleveur;
import com.example.demo.repository.EleveurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveurService {


    @Autowired
    private EleveurRepository eleveurRepository;

    public Eleveur getEleveurById(int id) {
        return eleveurRepository.getReferenceById((long) id);
    }
    public List<Eleveur> getAllEleveur() {
        return eleveurRepository.findAll();
    }

    public Eleveur saveEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    public Eleveur updateEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    public void deleteEleveur(int id) {
        eleveurRepository.deleteById((long)id);
    }
}
