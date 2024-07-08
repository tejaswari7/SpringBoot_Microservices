package com.order_service.controller;

import com.order_service.dto.OrderDto;
import com.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Slf4j
public class OrderContoller {

    private final OrderService orderService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addOrder(@RequestBody OrderDto order) {
        orderService.placeOrder(order);
        log.info("Order added: " + order);
        return "Order placed successfully";
    }
}
