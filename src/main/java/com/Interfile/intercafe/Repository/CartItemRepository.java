package com.Interfile.intercafe.Repository;

import com.Interfile.intercafe.Entity.CartItem;
import com.Interfile.intercafe.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByUserEmail(@Param("email") String email);

}