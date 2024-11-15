package com.example.demo.service;

import java.util.List;

public interface ExcelServiceInterface {
    List<String[]> readExcelFile(String filePath) throws IOException;
}
