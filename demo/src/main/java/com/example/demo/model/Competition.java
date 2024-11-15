package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Document
public class Competition {
    @Id
    private String id;

    private String competitionName;
    private String cordGPS;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    private double distance;
    private List<String> pigeonRingNumbers;
    private Competition(String competitionName, String cordGPS, Date startDate, double distance,List<String> pigeonRingNumbers) {

        this.competitionName = competitionName;
        this.cordGPS = cordGPS;
        this.startDate = startDate;
        this.distance = distance;
        this.pigeonRingNumbers = pigeonRingNumbers;

    }

    public Competition() {}

    public void setId(String id) {
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

    public void setPigeonRingNumbers(List<String> pigeonRingNumbers) {
        this.pigeonRingNumbers = pigeonRingNumbers;
    }
}
