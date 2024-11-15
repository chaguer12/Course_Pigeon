package com.example.demo;


import com.example.demo.service.impl.ExcelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ExcelServiceTest {

    @Autowired
    private ExcelService excelService;

    @Test
    public void testReadExcelFile() {
        // Provide a valid path to an Excel file for testing
        String filePath = "src/test/resources/test-data.xlsx";

        // Call the method
        List<String[]> result = excelService.readExcelFile(filePath);

        // Validate the result
        assertNotNull(result, "The result should not be null");
        assertTrue(result.size() > 0, "The result should contain at least one row");

        // Optionally print the result for debugging
        result.forEach(row -> System.out.println(String.join(", ", row)));
    }
}

