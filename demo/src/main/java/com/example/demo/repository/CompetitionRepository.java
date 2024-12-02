package com.example.demo.repository;

import com.example.demo.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompetitionRepository extends CrudRepository<Competition, Integer> {
    Optional<Competition> findById(String id);
}
