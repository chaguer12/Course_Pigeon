package com.example.demo.service.impl;

import com.example.demo.model.Competition;
import com.example.demo.repository.CompetitionRepository;

import com.example.demo.service.CompetitionServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompetitionService implements CompetitionServiceInterface {
    private final CompetitionRepository competitionRepository;
    @Override
    public Competition getCompetitionById(int id){
            return competitionRepository.findById(id).orElseThrow(()-> new RuntimeException("Entity not found"));
    }
    @Override
    public List<Competition> getAllCompetitions(){
        return competitionRepository.findAll();
    }
    @Override
    public Competition saveCompetition(Competition competition){
        return competitionRepository.save(competition);
    }
    @Override
    public Competition updateCompetition(Competition competition){
        return competitionRepository.save(competition);
    }
    @Override
    public void deleteCompetition(int id){
        competitionRepository.deleteById(id);
    }
}
