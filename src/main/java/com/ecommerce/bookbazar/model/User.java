package com.ecommerce.bookbazar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstname;
    private String lastname;
    private String email;
    private String address;

    @Column(name = "mobile_no")
    private String mobileNo;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private Cart cart;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
