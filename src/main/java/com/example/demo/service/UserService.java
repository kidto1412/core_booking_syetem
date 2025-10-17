package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Long id);

    User saveUser(User user);

    User updateUser(User user, Long id);

    void deleteUser(Long id);
}
