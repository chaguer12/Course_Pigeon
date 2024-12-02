package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Getter
@Setter
@Entity

public class Resultat {





    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String numeroBague;

    private Date heureArrivee;


    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;


    public Resultat(String numeroBague, Date heureArrivee, Competition competition) {
        this.numeroBague = numeroBague;
        this.heureArrivee = heureArrivee;
        this.competition = competition;
    }

    public Resultat() {}

}


