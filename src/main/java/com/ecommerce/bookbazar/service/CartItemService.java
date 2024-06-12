package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.bookbazar.model.CartItem;

public interface CartItemService {
    List<CartItem> getAllitems();
    Optional<CartItem> getCartItemById(Long id);
    void addCartItem(CartItem cartItem);
    void deleteCartItem(Long id);
}
