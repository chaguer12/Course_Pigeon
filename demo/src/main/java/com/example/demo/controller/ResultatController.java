package com.example.demo.controller;

import com.example.demo.model.Resultat;
import com.example.demo.service.impl.ResultatService;
import com.example.demo.service.impl.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resultats")
public class ResultatController {

    @Autowired
    private ResultatService resultatService;

    @Autowired
    private CompetitionService competitionService;

    @PostMapping
    public ResponseEntity<String> saveResultats(
            @RequestParam("competitionId") String competitionId,
            @RequestBody List<Resultat> resultats) {

        for (Resultat resultat : resultats) {
            resultat.setCompetition(competitionService.getCompetitionById(Integer.parseInt(competitionId)));
        }

        resultatService.saveAllResultats(resultats);
        return ResponseEntity.ok("Resultats saved successfully!");
    }

    @GetMapping
    public ResponseEntity<List<Resultat>> getAllResultats() {
        List<Resultat> resultats = resultatService.getAllResultats();
        return ResponseEntity.ok(resultats);
    }
}
