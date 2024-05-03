package com.Interfile.intercafe.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue
    private Long id;
    @JoinColumn @ManyToOne private UserEntity userEntity;
    @JoinColumn @ManyToOne private MealItem mealItem;
    @Column private Float orderAmount;
    @Column private String status;
    @Column Integer quantity;
    public Orders() {
    }
}
