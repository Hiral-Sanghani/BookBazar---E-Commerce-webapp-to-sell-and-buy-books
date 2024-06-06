package com.ecommerce.bookbazar.service;

import java.util.Optional;

import java.util.List;
import com.ecommerce.bookbazar.model.User;

public interface UserService {
    Optional<User> getUser(Long id);
    List<User> getAllUser();
    String createUser(User user);
    String updateUser(Long id, User user);
    String deleteUser(Long id);
}
