package com.ecommerce.bookbazar.controller;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bookbazar.model.User;
import com.ecommerce.bookbazar.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/fetch-user-details")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    
    @GetMapping("/fetch-user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/create-user")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update-user/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
