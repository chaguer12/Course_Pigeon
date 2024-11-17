package com.example.demo.repository;

import com.example.demo.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CompetitionRepository extends MongoRepository<Competition, String> {
    Optional<Competition> findById(String id);
}
