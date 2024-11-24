package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.bookbazar.model.CartItem;
import com.ecommerce.bookbazar.repository.CartItemRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{

    private CartItemRepository cartItemRepository;  

    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItem> getAllitems() {
        List<CartItem> items = cartItemRepository.findAll();
        return items;
    }

    @Override
    public Optional<CartItem> getCartItemById(Long cartItemid) {
        return cartItemRepository.findById(cartItemid);
    }

    @Override
    public void addCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public void deleteCartItem(Long id) {
       cartItemRepository.deleteById(id);
    }
    
}
