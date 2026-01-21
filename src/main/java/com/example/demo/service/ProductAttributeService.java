package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.request.ProductAttributeRequest;
import com.example.demo.dto.response.ProductAttributeResponse;
import com.example.demo.entity.ProductAttribute;

public interface ProductAttributeService {
    List<ProductAttributeResponse> findAll();

    ProductAttribute findById(Long id);

    void save(ProductAttributeRequest request);

    void update(ProductAttributeRequest request, Long id);

    void delete(Long id);
}
