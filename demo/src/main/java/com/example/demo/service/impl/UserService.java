package com.example.demo.service.impl;

import com.example.demo.exception.UserAlreadyExists;
import com.example.demo.model.User;
import com.example.demo.model.enums.Role;
import com.example.demo.repository.UserRepoInterface;
import com.example.demo.service.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepoInterface userRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User insertUser(User user){
        if(userRepo.findByEmail(user.getEmail()) == null){
        String encodePass = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePass);
        user.setRole(Role.ROLE_USER);
        userRepo.save(user);
        return user;
        }else{
            throw new UserAlreadyExists("User already exists with email: " + user.getEmail());
        }
    }

    @Override
    public boolean login(String email,String password) {
        User usr = userRepo.findByEmail(email);
        return email.equals(usr.getEmail()) && password.equals(usr.getPassword());
    }

    @Override
    public void deleteUser(User user) {
        userRepo.delete(user);
    }
    @Override
    public User findByEmail(String email){
        return userRepo.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }


}
