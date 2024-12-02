package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import com.example.demo.model.enums.Sexe;


import java.util.Date;

@Entity
public class Pigeon {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Setter
    @Getter
    private String eleveur;

    @Setter
    @Getter
    private String ringNumber;


    @Getter
    @Setter

    private Sexe sexe;

    @Getter
    @Setter
    private Integer age;

    @Setter
    @Getter
    private String couleur;

    




    private Pigeon( String eleveur,String ringNumber, Sexe sexe, Integer age, String couleur ){
        this.id = id;
        this.eleveur = eleveur;
        this.ringNumber = ringNumber;
        this.sexe = sexe;
        this.age = age;
        this.couleur = couleur;
    }

    public Pigeon() {}


}
