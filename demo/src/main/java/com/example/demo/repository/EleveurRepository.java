package com.example.demo.repository;

import com.example.demo.model.Eleveur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EleveurRepository extends MongoRepository<Eleveur, String> {
}
