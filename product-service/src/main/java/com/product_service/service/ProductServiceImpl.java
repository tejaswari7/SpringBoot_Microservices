package com.product_service.service;

import com.product_service.dto.ProductDto;
import com.product_service.model.Product;
import com.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productDao;



    @Override
    public Product createProduct(ProductDto productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getName())
                .price(productRequest.getPrice())
                .build();
        log.info("Creating product : {}", product);
        return productDao.save(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productDao.findAll();
        return products.stream().map(this::mapToProductDto).collect(Collectors.toList());
    }

    private ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }


}
