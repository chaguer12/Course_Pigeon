package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String competitionName;
    private String cordGPS;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;


    private double distance;
    private List<String> pigeonRingNumbers = new ArrayList<>();
    private Competition(String competitionName, String cordGPS, Date startDate, double distance,List<String> pigeonRingNumbers) {

        this.competitionName = competitionName;
        this.cordGPS = cordGPS;
        this.startDate = startDate;
        this.distance = distance;
        this.pigeonRingNumbers = pigeonRingNumbers;

    }

    public Competition() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public void setCordGPS(String cordGPS) {
        this.cordGPS = cordGPS;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getId() {
        return id;
    }
    public String getCompetitionName() {
        return competitionName;
    }
    public String getCordGPS() {
        return cordGPS;
    }
    public Date getStartDate() {
        return startDate;
    }
    public double getDistance() {
        return distance;
    }

    public void setPigeonRingNumbers(List<String> pigeonRingNumbers) {
        this.pigeonRingNumbers = pigeonRingNumbers;
    }

    public String getId() {
        return id;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public String getCordGPS() {
        return cordGPS;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getDistance() {
        return distance;
    }

    public List<String> getPigeonRingNumbers() {
        return pigeonRingNumbers;
    }
}
