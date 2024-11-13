package com.example.demo.service;

import com.example.demo.model.Competition;

import java.util.List;

public interface CompetitionServiceInterface {
    Competition getCompetitionById(long id);
    List<Competition> getAllCompetitions();
    Competition saveCompetition(Competition competition);
    Competition updateCompetition(Competition competition);
    void deleteCompetition(long id);
}
