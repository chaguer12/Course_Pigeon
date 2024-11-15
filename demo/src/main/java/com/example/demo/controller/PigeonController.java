package com.example.demo.controller;


import com.example.demo.model.Pigeon;
import com.example.demo.service.impl.ExcelService;
import com.example.demo.service.impl.PigeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/pigeons")
public class PigeonController {
    @Autowired
    private PigeonService pigeonService;

    private ExcelService excelService;

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




}
