package com.Interfile.intercafe.Service;

import com.Interfile.intercafe.Entity.Orders;
import com.Interfile.intercafe.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository ordersRepository;

    @Autowired
    public OrderService(OrderRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    public void addNewOrder(Orders order) {
        ordersRepository.save(order);
    }

    @Modifying
    public void deleteOrder(Long orderId) {
        ordersRepository.deleteById(orderId);
    }

    public Orders createOrder(Orders order) {
        return ordersRepository.save(order);
    }

    public List<Orders> getOrdersByUserId(int userId) {
        return ordersRepository.findAllByUserEntityId(userId);
    }
}
