package com.motorcycle.entity.cart;

import com.motorcycle.entity.ItemsCar;
import com.motorcycle.entity.ItemsMotorcycle;
import com.motorcycle.entity.RegisterUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<ItemsCar> cars;
    @OneToMany
    private List<ItemsMotorcycle> motorcycles;

    @OneToOne
    private RegisterUser user;

}
