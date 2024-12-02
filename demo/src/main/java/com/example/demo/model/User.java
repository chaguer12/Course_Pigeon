package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    public User(String name,int age,String email, String password){
        this.name = name;
        this.age = age;
        this.email= email;
        this.password = password;

    }
    public User(){

    }



}
