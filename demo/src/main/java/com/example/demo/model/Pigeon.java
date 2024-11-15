package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Pigeon {
    @Setter
    @Getter
    @Id
    private String id;


    @Setter
    @Getter
    private Eleveur eleveur;

    @Setter
    @Getter
    private String ringNumber;

    @Setter
    @Getter
    private String sexe;

    @Getter
    @Setter
    private Integer age;

    @Setter
    @Getter
    private String couleur;

    @Setter
    @Getter
    private Date arriveDate;



    private Pigeon( Eleveur eleveur,String ringNumber, String sexe, Integer age, String couleur, Date arriveDate) {
        this.id = id;
        this.eleveur = eleveur;
        this.ringNumber = ringNumber;
        this.sexe = sexe;
        this.age = age;
        this.couleur = couleur;
        this.arriveDate = arriveDate;
    }

    public Pigeon() {}

}
