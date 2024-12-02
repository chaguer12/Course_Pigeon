package com.example.demo.service;

import com.example.demo.model.Competition;

import java.util.List;

public interface CompetitionServiceInterface {
    Competition saveCompetition(Competition competition);
    List<Competition> getAllCompetitions();
    Competition getCompetitionById(int id);
    Competition updateCompetition(Competition competition);
    void deleteCompetition(int id);
}

