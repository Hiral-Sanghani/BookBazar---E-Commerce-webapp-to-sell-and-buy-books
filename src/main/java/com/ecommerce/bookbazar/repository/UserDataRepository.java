package com.ecommerce.bookbazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bookbazar.model.User;

@Repository
public interface UserDataRepository extends JpaRepository<User, Long>{ }