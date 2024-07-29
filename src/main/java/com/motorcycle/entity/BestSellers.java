package com.motorcycle.entity;

import com.motorcycle.utils.LevelSellers;
import jakarta.persistence.*;

@Entity
public class BestSellers {
    @Id
    @GeneratedValue
//    @Enumerated(EnumType.STRING)
    private Long id;
    private LevelSellers levelSellers;
//@ManyToOne
//@JoinColumn(name = "motocycle_id", nullable = false)
//private CaracteristiciMotorcycle caracteristiciMotorcycle;
//@ManyToOne
//@JoinColumn(name = "user_id", nullable = false)
//private Inregistrare inregistrare;
//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LevelSellers getLevelSellers() {
        return levelSellers;
    }

    public void setLevelSellers(LevelSellers levelSellers) {
        this.levelSellers = levelSellers;
    }
}
