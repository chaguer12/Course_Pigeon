package com.example.demo.model;


import com.example.demo.model.enums.Sexe;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pigeon {
    @Id
    private String id;
    private String eleveur;
    @Indexed(unique = true)
    private String ringNumber;
    private Sexe sexe;
    private Integer age;
    private String couleur;



    private Pigeon( String eleveur,String ringNumber, Sexe sexe, Integer age, String couleur ){
        this.id = id;
        this.eleveur = eleveur;
        this.ringNumber = ringNumber;
        this.sexe = sexe;
        this.age = age;
        this.couleur = couleur;

    }
    public String getEleveur() {
        return eleveur;
    }

    public void setEleveur(String eleveur) {
        this.eleveur = eleveur;
    }
    public Pigeon() {}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRingNumber() {
        return ringNumber;
    }
    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }
    public Sexe getSexe() {
        return sexe;
    }
    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


}
