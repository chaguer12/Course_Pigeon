package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Getter
@Document
public class Resultat {


    @Setter
    @Id
    private String id;

    @Setter
    private String numeroBague;

    @Setter
    private LocalTime heureArrivee;

}


