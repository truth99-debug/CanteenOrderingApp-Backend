package com.Interfile.intercafe.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "checkout", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;

    private BigDecimal totalPrice;

    private String status; // e.g., "PENDING", "COMPLETED", "FAILED"

    public Checkout(UserEntity user) {
        this.user = user;
        this.items = new ArrayList<>();
    }


}

