package com.example.demo.service;

import com.example.demo.model.User;

public interface UserServiceInterface {
    User insertUser(User user);
    boolean login(String email,String password);
    void deleteUser(User user);
}
