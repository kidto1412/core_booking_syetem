package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.request.UserRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;

public interface UserService {

    List<UserResponse> findAllUsers();

    User findUserById(Long id);

    void saveUser(UserRequest user);

    void updateUser(UserRequest user, Long id);

    void deleteUser(Long id);
}
