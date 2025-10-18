package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import com.example.demo.util.BeanMapper;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductResponse> findAllProducts() {
        List<Product> products = productRepository.findAll();
        return BeanMapper.mapAsList(products, ProductResponse.class);
    }

    @Override
    public Product findProductById(Long id) {
        Product product = productRepository.findById(id).orElse(new Product());
        return product;
    }

    @Override
    public void saveProduct(ProductRequest request) {
        Product product = BeanMapper.map(request, Product.class);
        productRepository.save(product);
    }

    @Override
    public void updateProduct(ProductRequest request, Long id) {
        Product product = BeanMapper.map(request, Product.class);
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElse(new Product());
        productRepository.delete(product);
    }
}
