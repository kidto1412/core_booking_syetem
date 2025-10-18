package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Operation;
import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/product")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductResponse> getAllUsers() {
        return productService.findAllProducts();
    }

    @PostMapping()
    public Operation saveProduct(@Valid @RequestBody ProductRequest request) {
        productService.saveProduct(request);
        return Operation.CREATED;
    }

    @PutMapping("/{id}")
    public Operation updateProduct(@PathVariable Long id, @Valid @RequestBody ProductRequest request) {
        productService.updateProduct(request, id);
        return Operation.UPDATED;
    }

    @DeleteMapping("/{id}")
    public Operation deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return Operation.DELETED;
    }
}
