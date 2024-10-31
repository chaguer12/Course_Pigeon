package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String competitionName;
    private String cordGPS;
    private Date startDate;
    private double distance;

    private Competition(String competitionName, String cordGPS, Date startDate, double distance) {
        this.id = id;
        this.competitionName = competitionName;
        this.cordGPS = cordGPS;
        this.startDate = startDate;
        this.distance = distance;

    }

    public Competition() {}

    public double getDistance() {
        return distance;
    }

    public long getId() {
        return id;
    }

    public String getCordGPS() {
        return cordGPS;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public Date getStartDate() {
        return startDate;
    }

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
