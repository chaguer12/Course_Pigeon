package com.example.demo.repository;

import com.example.demo.model.Pigeon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PigeonRepository extends MongoRepository<Pigeon, String> {
}
