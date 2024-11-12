package com.example.demo.model;


import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Document
public class Competition {
    @Id
    private long id;

    private String competitionName;
    private String cordGPS;
    private Date startDate;
    private double distance;

    private Competition(String competitionName, String cordGPS, Date startDate, double distance) {

        this.competitionName = competitionName;
        this.cordGPS = cordGPS;
        this.startDate = startDate;
        this.distance = distance;

    }

    public Competition() {}

    public void setId(long id) {
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
}
