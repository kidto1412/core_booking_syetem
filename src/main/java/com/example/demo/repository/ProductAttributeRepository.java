package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProductAttribute;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Long> {

}
