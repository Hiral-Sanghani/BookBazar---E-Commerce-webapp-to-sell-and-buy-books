package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import com.ecommerce.bookbazar.model.Cart;
import com.ecommerce.bookbazar.repository.CartDataRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartServiceImpl implements CartService{

    @Autowired
    CartDataRepository cartDataRepository;

    @Override
    public void createCart(Cart cart) {
        cart.setCreatedDate(LocalDate.now());
        cartDataRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCart() {
        System.out.println("BEfore call =====>   ");
        List<Cart> list =  cartDataRepository.findAll();
        System.out.println("Cart List Items ====>   ");
        return list;
    }

    @Override
    public Optional<Cart> getCartById(Long id) {
        return cartDataRepository.findById(id);
    }

    @Override
    public void deleteCart(Long id) {
        cartDataRepository.deleteById(id);
    }
    
}
