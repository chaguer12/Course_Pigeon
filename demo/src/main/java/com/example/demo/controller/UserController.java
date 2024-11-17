package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceInterface;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceInterface service;

    @PostMapping("/sign-up")
    public ResponseEntity<?> signUpUser(@RequestBody User user){
        User usr = service.insertUser(user);
        return ResponseEntity.ok(usr);
    }
    @PostMapping("/log-in")
    public ResponseEntity<?> logInUser(@RequestBody String email, String password, HttpServletRequest req){
        if (service.login(email,password)) {
            req.getSession().setAttribute("loggedUser",service.findByEmail(email));
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping()
    public ResponseEntity<User> getUser(@RequestBody String id){
       User user = service.findByEmail(id);

    public ResponseEntity<?> logInUser(@RequestBody User user, HttpServletRequest req){
        if (service.login(user.getEmail(),user.getPassword())) {
            User usr = service.findByEmail(user.getEmail());
            req.getSession().setAttribute("loggedUser",usr);
            return ResponseEntity.status(100).build();
        }else{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No user with these credentials was found");
        }
    }
    @PostMapping("/test")
    public ResponseEntity<User> getUser(@RequestBody User email){
        User user = service.findByEmail(email.getEmail());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);

    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> listUsers =  service.findAll();
        return ResponseEntity.status(HttpStatus.FOUND).body(listUsers);

    }
}
