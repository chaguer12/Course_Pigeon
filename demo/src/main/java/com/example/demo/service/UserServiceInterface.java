package com.example.demo.service;

import com.example.demo.model.User;

public interface UserServiceInterface {
    User insertUser(User user);
    boolean login(User user);
    User getUserByEmail(String email);
    void deleteUser(User user);
}
