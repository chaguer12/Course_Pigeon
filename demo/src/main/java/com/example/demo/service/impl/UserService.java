package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepoInterface userRepo;

    public User insertUser(User user){
        userRepo.save(user);
        return user;
    }

    


}
