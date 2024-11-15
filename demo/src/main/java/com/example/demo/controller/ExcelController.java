package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public List<String[]> uploadExcelFile(@RequestParam("file") MultipartFile file) throws IOException {
        String filePath = "temp/" + file.getOriginalFilename(); // Enregistrez temporairement le fichier
        file.transferTo(new java.io.File(filePath));

        return excelService.readExcelFile(filePath);
    }
}
