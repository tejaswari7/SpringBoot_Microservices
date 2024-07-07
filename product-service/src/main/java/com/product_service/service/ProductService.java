package com.product_service.service;

import com.product_service.dto.ProductDto;
import com.product_service.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDto product);
    List<ProductDto> getAllProducts();
}
