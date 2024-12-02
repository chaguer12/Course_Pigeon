package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Eleveur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String email;
    private String password;
    private String colombierName;
    private String cordGPS;

    public Eleveur(int id, String name, String email, String password, String colombierName, String cordGPS) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.colombierName = colombierName;
        this.cordGPS = cordGPS;

    }

    public Eleveur(String name, String email, String password, String colombierName, String cordGPS) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.colombierName = colombierName;
        this.cordGPS = cordGPS;
    }
    public Eleveur() {

    }


}
