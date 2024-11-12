package com.example.demo.repository;
import com.example.demo.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepoInterface extends MongoRepository<User, String> {
    User findByEmail(String email);
    boolean existsByEmail (String email);

}
