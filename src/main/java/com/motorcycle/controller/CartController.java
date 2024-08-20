package com.motorcycle.controller;

import com.motorcycle.entity.cart.Cart;
import com.motorcycle.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<Cart> listCart() {
        return cartService.listCart();
    }

    @PostMapping
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @GetMapping("/get/{id}")
    public Optional<Cart> findCartById(@PathVariable Long id) {
        return cartService.findCartById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCartById(@PathVariable Long id) {
        cartService.deleteCarById(id);
    }
}
