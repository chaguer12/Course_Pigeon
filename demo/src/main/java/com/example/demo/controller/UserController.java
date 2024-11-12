package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceInterface;
import jakarta.servlet.http.HttpServletRequest;
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
    public ResponseEntity<?> signUpUser(@RequestBody User user){
        User usr = service.insertUser(user);
        return ResponseEntity.ok(usr);
    }
    @PostMapping("/log-in")
    public ResponseEntity<?> logInUser(@RequestBody String email, String password, HttpServletRequest req){
        if (service.login(email,password)) {
            req.getSession().setAttribute("loggedUser",email);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
