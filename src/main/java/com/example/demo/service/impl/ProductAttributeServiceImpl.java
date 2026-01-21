package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.example.demo.dto.request.ProductAttributeRequest;
import com.example.demo.dto.response.ProductAttributeResponse;
import com.example.demo.entity.ProductAttribute;
import com.example.demo.repository.ProductAttributeRepository;
import com.example.demo.util.BeanMapper;

public class ProductAttributeServiceImpl extends ProductAttribute {
    @Autowired
    ProductAttributeRepository productAttributeRepository;

    @Override
    public List<ProductAttributeResponse> findAll() {
        List<ProductAttribute> productAttributes = productAttributeRepository.findAll();
        return BeanMapper.mapAsList(productAttributes, ProductAttributeResponse.class);
    }

    @Override
    public ProductAttributeResponse findById(Long id) {
        ProductAttribute productAttributes = productAttributeRepository.findById(id).orElse(new ProductAttribute());
        return productAttributes;
        
    }

    @Override
    public void save(ProductAttributeRequest request){
        ProductAttribute productAttribute = BeanMapper.map(request, ProductAttribute.class);
        productAttributeRepository.save(productAttribute);
    }
}
