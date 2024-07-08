package com.order_service.service;


import com.order_service.dto.OrderDto;

public interface OrderService {
    public void placeOrder(OrderDto order);
}
