package com.Interfile.intercafe.Service;

import com.Interfile.intercafe.Entity.CartItem;
import com.Interfile.intercafe.Entity.UserEntity;
import com.Interfile.intercafe.Repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CartServices {

    private CartItemRepository cartItemRepository;

    public List<CartItem> listCartItems(UserEntity user){
        return cartItemRepository.findByUserEmail(user.getEmail());
    }


}
