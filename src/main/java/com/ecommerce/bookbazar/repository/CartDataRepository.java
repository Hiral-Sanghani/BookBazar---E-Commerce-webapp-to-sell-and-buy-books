package com.ecommerce.bookbazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bookbazar.model.Cart;

@Repository
public interface CartDataRepository extends JpaRepository<Cart,Long>{ }