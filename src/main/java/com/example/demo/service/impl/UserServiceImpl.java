package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.request.UserRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.util.BeanMapper;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponse> findAllUsers() {
        List<User> users = userRepository.findAll();
        return BeanMapper.mapAsList(users, UserResponse.class);
    }

    @Override
    public User findUserById(Long id) {
        User user = userRepository.findById(id).orElse(new User());
        return user;
    }

    @Override
    public void saveUser(UserRequest request) {
        User user = BeanMapper.map(request, User.class);
        userRepository.save(user);
    }

    @Override
    public void updateUser(UserRequest request, Long id) {
        User user = BeanMapper.map(request, User.class);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElse(new User());
        userRepository.delete(user);
    }
}
