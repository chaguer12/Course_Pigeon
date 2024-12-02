package com.example.demo.repository;

import com.example.demo.model.Pigeon;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.Optional;

public interface PigeonRepository extends MongoRepository<Pigeon, String> {
    Optional<Pigeon> findByRingNumber(String ringNumber);

}
