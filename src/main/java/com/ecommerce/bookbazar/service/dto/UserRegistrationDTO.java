package com.ecommerce.bookbazar.service.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDTO extends UserDTO{

    @Column(name = "password")
    private String password;
}
