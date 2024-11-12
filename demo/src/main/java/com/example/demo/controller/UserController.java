package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServiceInterface service;

    @PostMapping("/sign-up")
    public ResponseEntity<Void> signUpUser(@RequestBody User user){
        service.insertUser(user);
        return ResponseEntity.ok().build();
    }
}
