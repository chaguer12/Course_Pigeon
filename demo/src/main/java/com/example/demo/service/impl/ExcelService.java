package com.example.demo.service.impl;

import com.example.demo.model.Resultat;
import com.example.demo.repository.ResultatRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    private ResultatRepository resultatRepository;

    public List<Resultat> readAndSaveResultats(Path filePath) throws IOException {
        List<Resultat> resultats = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath.toFile());
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // assuming data is in the first sheet
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            for (Row row : sheet) {
                if (row.getRowNum() == 0) { // Skip header row
                    continue;
                }

                Cell cellNumeroBague = row.getCell(0);
                Cell cellHeureArrivee = row.getCell(1);

                String numeroBague = cellNumeroBague.getStringCellValue();
                String heureStr = cellHeureArrivee.getStringCellValue();
                LocalTime heureArrivee = LocalTime.parse(heureStr, timeFormatter);

                Resultat resultat = new Resultat();
                resultat.setNumeroBague(numeroBague);
                resultat.setHeureArrivee(heureArrivee);

                resultats.add(resultat);
            }
        }

        // Save all Resultats to the database
        return resultatRepository.saveAll(resultats);
    }
}
