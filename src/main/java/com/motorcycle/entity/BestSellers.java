package com.motorcycle.entity;

import com.motorcycle.utils.LevelSellers;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BestSellers {
    @Id
    @GeneratedValue
    private Long id;
    private LevelSellers levelSellers;
}
