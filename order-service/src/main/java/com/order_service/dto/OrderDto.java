package com.order_service.dto;

import com.order_service.model.OrderLineItems;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
//    private Long id;
//    private String orderId;
//    private String orderNumber;
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
