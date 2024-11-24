package com.ecommerce.bookbazar.web.rest;

import com.ecommerce.bookbazar.service.UserService;
import com.ecommerce.bookbazar.service.dto.UserDTO;
import com.ecommerce.bookbazar.service.dto.UserRegistrationDTO;
import com.ecommerce.bookbazar.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserResource {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public List<Optional<UserDTO>> getAllUser() {

        return null;
    }

    @GetMapping("/user/{id}")
    public Optional<UserDTO> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserRegistrationDTO user) {
        System.out.println("userreg dto ----" + user);
        return userService.createUser(user);
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserDTO user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}