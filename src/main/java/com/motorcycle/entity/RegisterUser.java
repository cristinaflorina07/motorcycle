package com.motorcycle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RegisterUser {
    @Id
    @GeneratedValue
   private Long Id;
    private String username;
    private String password;
}
