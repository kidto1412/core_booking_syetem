package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.Product;

public interface ProductService {

    List<ProductResponse> findAllProducts();

    Product findProductById(Long id);

    void saveProduct(ProductRequest product);

    void updateProduct(ProductRequest product, Long id);

    void deleteProduct(Long id);
}
