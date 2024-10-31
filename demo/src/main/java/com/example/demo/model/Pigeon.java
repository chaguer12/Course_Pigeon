package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pigeon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ringNumber;
    private String sexe;
    private Integer age;
    private String couleur;

    public Pigeon(long id, String ringNumber, String sexe, Integer age, String couleur) {
        this.id = id;
        this.ringNumber = ringNumber;
        this.sexe = sexe;
        this.age = age;
        this.couleur = couleur;
    }
    public Pigeon() {}
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRingNumber() {
        return ringNumber;
    }
    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
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
