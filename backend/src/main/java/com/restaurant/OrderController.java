package com.restaurant.controller;

import com.restaurant.model.Order;
import com.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/{foodId}")
    public Order placeOrder(@PathVariable("foodId") int foodId) {
        Order order = new Order();
        order.setFoodId(foodId);
        return orderRepository.save(order);
    }
}
