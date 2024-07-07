package com.product_service.controller;

import com.product_service.dto.ProductDto;
import com.product_service.model.Product;
import com.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/addproduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto product) {
        productService.createProduct(product);
    }

    @GetMapping("/getproducts")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

}
