package com.example.demo.service.impl;


import com.example.demo.model.Competition;
import com.example.demo.model.Pigeon;
import com.example.demo.model.enums.Sexe;
import com.example.demo.repository.CompetitionRepository;
import com.example.demo.repository.PigeonRepository;
import com.example.demo.service.PigeonServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PigeonService implements PigeonServiceInterface {


    private final CompetitionRepository compRepo;
    private final PigeonRepository pigeonRepository;
    @Override
    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }
    @Override
    public Optional<Pigeon> getPigeonById(String id) {
        return pigeonRepository.findById(id);
    }
    @Override
    public Pigeon savePigeon(Pigeon pigeon) {
        if(pigeon.getSexe() == Sexe.F){
            pigeon.setRingNumber(String.valueOf(Sexe.F)+"-"+UUID.randomUUID());
        }else {
            pigeon.setRingNumber(String.valueOf(Sexe.M)+"-"+ UUID.randomUUID());
        }
        System.out.println(pigeon.getRingNumber());
        return pigeonRepository.save(pigeon);
    }
    @Override
    public void deletePigeon(String id) {
        pigeonRepository.deleteById(id);
    }
    @Override
    public Competition assignPigeon(String ringNumber, String id){

        Competition comp = compRepo.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
        Pigeon pig = pigeonRepository.findByRingNumber(ringNumber).orElseThrow(() -> new  RuntimeException("Entity not found"));
        System.out.println("comp: "+comp.getId() +" pig: "+pig.getRingNumber());
        // Format de la date "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Obtenir la date actuelle formatée
        String formattedDate = LocalDateTime.now().format(formatter);
        LocalDateTime localNow = LocalDateTime.parse(formattedDate, formatter);

        // Conversion de LocalDateTime à java.sql.Date
        long millis = localNow.atZone(java.time.ZoneId.systemDefault()).toInstant().toEpochMilli();
        Date now = new Date(millis);

        if(comp.getStartDate().after(now)){
            List<String> ringNumbers = comp.getPigeonRingNumbers();
            ringNumbers.add(ringNumber);
            comp.setPigeonRingNumbers(ringNumbers);
            compRepo.save(comp);
            return comp;

        }else{
            throw new RuntimeException("U've missed the time!");
        }

    }
}
