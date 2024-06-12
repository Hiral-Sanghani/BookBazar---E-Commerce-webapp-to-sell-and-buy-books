package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.bookbazar.model.Cart;

public interface CartService {
    void createCart(Cart cart);
    List<Cart> getAllCart();
    Optional<Cart> getCartById(Long id);
    void deleteCart(Long id);
}