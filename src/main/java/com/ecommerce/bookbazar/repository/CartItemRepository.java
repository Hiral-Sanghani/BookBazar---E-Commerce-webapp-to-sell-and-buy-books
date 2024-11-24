package com.ecommerce.bookbazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bookbazar.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> { }
