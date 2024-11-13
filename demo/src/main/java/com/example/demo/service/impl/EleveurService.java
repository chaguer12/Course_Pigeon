package com.example.demo.service.impl;


import com.example.demo.model.Eleveur;
import com.example.demo.repository.EleveurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EleveurService {


    private final EleveurRepository eleveurRepository;

    public Eleveur getEleveurById(long id) {
//  return eleveurRepository.findBy( id);
        return  null;
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
