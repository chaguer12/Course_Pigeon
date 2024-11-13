package com.example.demo.service.impl;


import com.example.demo.model.Eleveur;
import com.example.demo.repository.EleveurRepository;
import com.example.demo.service.ElveurServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EleveurService implements ElveurServiceInterface {


    private final EleveurRepository eleveurRepository;
    @Override
    public Eleveur getEleveurById(long id) {
//  return eleveurRepository.findBy( id);
        return  null;
    }
    @Override
    public List<Eleveur> getAllEleveur() {
        return eleveurRepository.findAll();
    }
    @Override
    public Eleveur saveEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    @Override
    public Eleveur updateEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    @Override
    public void deleteEleveur(int id) {
        eleveurRepository.deleteById((long)id);
    }
}
