package com.example.demo.controller;

import com.example.demo.model.Competition;
import com.example.demo.model.Eleveur;
import com.example.demo.service.CompetitionService;
import com.example.demo.service.EleveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competitions")
public class CompetitionController {

        @Autowired
        private CompetitionService competitionService;

        @GetMapping
        public List<Competition> getAllCompetitions() {
            return competitionService.getAllCompetitions();
        }

        @GetMapping("/{id}")
        public Competition getCompetitionById(@PathVariable long id) {
            return competitionService.getCompetitionById(id);
        }

        @PostMapping
        public Competition addCompetition(@RequestBody Competition competition) {
            return competitionService.saveCompetition(competition);
        }

        @DeleteMapping("/{id}")
        public void deleteCompetition(@PathVariable int id) {
            competitionService.deleteCompetition(id);
        }
}
