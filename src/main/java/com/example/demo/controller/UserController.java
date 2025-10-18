package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Operation;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;;

@RestController
@RequestMapping("api/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping()
    public Operation saveProduct(@Valid @RequestBody User user) {
        userService.saveUser(user);
        return Operation.CREATED;
    }

    @PutMapping("/{id}")
    public Operation updateUser(@PathVariable Long id, @Valid @RequestBody User user) {
        userService.updateUser(user, id);
        return Operation.UPDATED;
    }

    @DeleteMapping("/{id}")
    public Operation deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return Operation.DELETED;
    }
}
