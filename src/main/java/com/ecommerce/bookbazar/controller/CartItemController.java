package com.ecommerce.bookbazar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bookbazar.model.CartItem;
import com.ecommerce.bookbazar.service.CartItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("user/cart/cart-item")
public class CartItemController {

    private CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping("/get-items")
    public List<CartItem> getAllItem() {
        return cartItemService.getAllitems();
    }
    
    @PostMapping("/add-item")
    public void addItemToCart(@RequestBody CartItem item) {
        cartItemService.addCartItem(item);
    }
    
    @GetMapping("/get-item-by-id")
    public Optional<CartItem> getCartItemById(@PathVariable Long itemId) {
        return cartItemService.getCartItemById(itemId);
    }
} 
