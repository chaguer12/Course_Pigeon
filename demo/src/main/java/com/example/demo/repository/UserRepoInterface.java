package com.example.demo.repository;
import com.example.demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoInterface extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    boolean existsByEmail (String email);

}
