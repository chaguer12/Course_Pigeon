package com.example.demo.repository;

import com.example.demo.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompetitionRepository extends JpaRepository<Competition, Integer> {
    Optional<Competition> findById(int id);
}
