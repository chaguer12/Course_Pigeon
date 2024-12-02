package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
=======
import com.example.demo.model.enums.Sexe;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
    private String eleveur;

    @Setter
    @Getter
    @Indexed(unique = true)
    private String ringNumber;

    @Setter
    @Getter
    private String sexe;

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
