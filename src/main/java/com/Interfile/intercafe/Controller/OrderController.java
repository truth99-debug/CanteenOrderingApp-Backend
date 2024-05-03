package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Entity.Orders;
import com.Interfile.intercafe.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("create")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
        Orders savedOrder = orderService.createOrder(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }

    @PostMapping("add")
    public void addNewOrder(@RequestBody Orders order) {
        orderService.addNewOrder(order);
    }

    @GetMapping(path = "/deleteOrder/{orderId}")
    public void deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
    }

    @GetMapping("/getOrdersByUserId/{userId}")
    public List<Orders> getOrdersByUserId(@PathVariable int userId) {
        return orderService.getOrdersByUserId(userId);
    }
}



