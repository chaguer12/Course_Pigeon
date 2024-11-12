package com.example.demo;

import com.example.demo.service.DistanceCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DistanceCalculatorTest {

    private static final double EARTH_RADIUS_KM = 6378.137;

    @Test
    public void testCalculateDistance() {
        double startLat = 34.0522; // Los Angeles
        double startLon = -118.2437;
        double endLat = 40.7128; // New York City
        double endLon = -74.0060;

        double expectedDistance = 3935;
        double actualDistance = DistanceCalculator.calculateDistance(startLat, startLon, endLat, endLon);
        assertEquals(expectedDistance, actualDistance, 1.2);


    }
}
