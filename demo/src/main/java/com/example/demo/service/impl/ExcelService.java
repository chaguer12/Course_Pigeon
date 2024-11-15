package com.example.demo.service.impl;

import com.example.demo.service.ExcelServiceInterface;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.apache.poi.ss.usermodel.CellType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NUMERIC;
import static javax.management.openmbean.SimpleType.STRING;

@Service
public class ExcelService implements ExcelServiceInterface {

    public List<String[]> readExcelFile(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0); // Lire la première feuille
            for (Row row : sheet) {
                List<String> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        default:
                            rowData.add("");
                    }
                }
                data.add(rowData.toArray(new String[0]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}

