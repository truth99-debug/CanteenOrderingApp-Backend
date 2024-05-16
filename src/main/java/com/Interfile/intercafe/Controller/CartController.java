package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Entity.CartItem;
import com.Interfile.intercafe.Service.CartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class CartController {
    @Autowired
    private CartServices cartServices;



}
