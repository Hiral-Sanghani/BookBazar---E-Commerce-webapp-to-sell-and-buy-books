package com.ecommerce.bookbazar.service;

import java.util.Optional;

import java.util.List;
;
import com.ecommerce.bookbazar.service.dto.UserDTO;
import com.ecommerce.bookbazar.service.dto.UserRegistrationDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    Optional<UserDTO> getUser(Long id);
    Optional<List<UserDTO>> getAllUser();
    ResponseEntity createUser(UserRegistrationDTO user);
    String updateUser(Long id, UserDTO user);
    ResponseEntity<String> deleteUser(Long id);
}
