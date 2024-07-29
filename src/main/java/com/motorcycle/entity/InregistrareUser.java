package com.motorcycle.entity;

import jakarta.persistence.*;

@Entity
public class InregistrareUser {
    @Id
    @GeneratedValue
   private Long Id;
    private String username;
    private String password;
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<BestSellers> bestSellersSet;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
