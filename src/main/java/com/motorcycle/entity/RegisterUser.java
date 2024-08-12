package com.motorcycle.entity;

import com.motorcycle.entity.cart.Cart;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class RegisterUser {
    @Id
    @GeneratedValue
    private Long Id;
    private String username;
    private String password;

    @OneToOne
    private Cart cart;

}

