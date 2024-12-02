package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
=======
@Document
public class Resultat {


@Getter
@Setter
@Enti
public class Resultat {


    @Setter
    @Getter
    @Id
    private String id;

    @Setter
    @Getter
    private String numeroBague;

    @Setter
    @Getter
    private Date heureArrivee;

    @Setter
    @Getter
    private Competition competition;


    public Resultat(String numeroBague, Date heureArrivee, Competition competition) {
        this.numeroBague = numeroBague;
        this.heureArrivee = heureArrivee;
        this.competition = competition;
    }

    public Resultat() {}

}


