package com.Interfile.intercafe.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table
@Setter
public class MealItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    @Column
    private Float price;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private String imageURL;

    private String category;

    public MealItem(int id, String name, Float price, String description, String image, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public MealItem() {

    }
}
