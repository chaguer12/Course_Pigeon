package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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


}
