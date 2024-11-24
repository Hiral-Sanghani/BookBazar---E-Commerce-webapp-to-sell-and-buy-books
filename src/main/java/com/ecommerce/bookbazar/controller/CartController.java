package com.ecommerce.bookbazar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bookbazar.model.Cart;
import com.ecommerce.bookbazar.service.CartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("user/cart")
public class CartController {
    
    @Autowired
    CartService cartService;

    @GetMapping("/get-all-cart")
    public List<Cart> getAllCart() {
        return cartService.getAllCart();
    }

    @PostMapping("/create-cart")
    public void createCart(@RequestBody Cart cart) {
        cartService.createCart(cart);
    }
    
    @GetMapping("/get-cart-by-id/{id}")
    public Optional<Cart> getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @DeleteMapping("/delete-cart/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
    }
    
}
