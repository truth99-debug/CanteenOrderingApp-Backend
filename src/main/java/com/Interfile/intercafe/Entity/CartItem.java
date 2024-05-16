package com.Interfile.intercafe.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.Interfile.intercafe.Entity.MealItem;
import com.Interfile.intercafe.Entity.UserEntity;

@Getter
@Entity
@Table
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "mealItem_id")
    private MealItem mealItem;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "checkout_id")
    private Checkout checkout;


    private int quantity;

}