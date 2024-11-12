package com.example.demo.repository;

import com.example.demo.model.Resultat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultatRepository extends MongoRepository<Resultat, Long> {
}
