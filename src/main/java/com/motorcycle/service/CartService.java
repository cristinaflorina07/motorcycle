package com.motorcycle.service;

import com.motorcycle.entity.cart.Cart;
import com.motorcycle.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;


    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }
    public List<Cart> listCart(){
        return cartRepository.findAll();
    }
    public Optional<Cart> findCartById(Long id){
        return cartRepository.findById(id);
    }

}
