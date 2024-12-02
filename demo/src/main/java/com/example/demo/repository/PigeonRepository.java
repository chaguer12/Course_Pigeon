package com.example.demo.repository;

import com.example.demo.model.Pigeon;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface PigeonRepository extends JpaRepository<Pigeon, Integer> {
    Optional<Pigeon> findByRingNumber(String ringNumber);

}
