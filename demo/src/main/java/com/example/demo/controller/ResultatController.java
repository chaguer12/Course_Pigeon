package com.example.demo.controller;

import com.example.demo.model.Resultat;
import com.example.demo.service.impl.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/resultats")
public class ResultatController {

    @Autowired
    private ExcelService excelService;

    private final Path uploadDir = Paths.get("uploads"); // Directory to save uploaded files

    @PostMapping("/upload")
    public ResponseEntity<List<Resultat>> uploadExcelFile(@RequestParam("file") MultipartFile file) {
        try {
            if (!Files.exists(uploadDir)) {
                Files.createDirectories(uploadDir);
            }

            Path filePath = uploadDir.resolve(file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath);

            List<Resultat> resultats = excelService.readAndSaveResultats(filePath);

            return ResponseEntity.ok(resultats);

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }
}
