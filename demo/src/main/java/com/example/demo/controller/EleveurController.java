package com.example.demo.controller;


import com.example.demo.model.Eleveur;
import com.example.demo.service.ElveurServiceInterface;
import com.example.demo.service.impl.EleveurService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eleveurs")
@RequiredArgsConstructor
public class EleveurController {


    private final ElveurServiceInterface eleveurService;

    @GetMapping
    public List<Eleveur> getAllEleveurs() {
        return eleveurService.getAllEleveur();
    }

    @GetMapping("/{id}")
    public Eleveur getEleveurById(@PathVariable String id) {
        return eleveurService.getEleveurById(id);
    }

    @PostMapping
    public Eleveur addEleveur(@RequestBody Eleveur eleveur) {
        return eleveurService.saveEleveur(eleveur);
    }

    @DeleteMapping("/{id}")
    public void deleteEleveur(@PathVariable String id) {
        eleveurService.deleteEleveur(id);
    }

}
