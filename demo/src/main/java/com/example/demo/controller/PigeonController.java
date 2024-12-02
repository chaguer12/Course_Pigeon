package com.example.demo.controller;


import com.example.demo.controller.requests.AssignRequest;
import com.example.demo.model.Competition;
import com.example.demo.model.Pigeon;
import com.example.demo.service.impl.PigeonService;
import com.example.demo.service.PigeonServiceInterface;
import com.example.demo.service.impl.PigeonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pigeons")
@RequiredArgsConstructor
public class PigeonController {

    private final PigeonServiceInterface pigeonService;


    @GetMapping
    public List<Pigeon> getAllPigeons()
    {
        return pigeonService.getAllPigeons();
    }

//    @GetMapping("/{id}")
//    public Pigeon getPigeonById(@PathVariable int id){
//        return pigeonService.getPigeonById((int)id);
//    }

    @PostMapping
    public Pigeon createPigeon(@RequestBody Pigeon pigeon){
        return pigeonService.savePigeon(pigeon);
    }

    @DeleteMapping("/{id}")
    public void deletePigeon(@PathVariable String id){
        pigeonService.deletePigeon(id);
    }
    @PostMapping("/assign")
    public ResponseEntity<Competition> assignPigeon(@RequestBody AssignRequest req){
        System.out.println("hnaaaa : " + req.id());
        Competition comp = pigeonService.assignPigeon(req.ringNumber(), req.id());
        return  ResponseEntity.status(HttpStatus.FOUND).body(comp);
    }




}
