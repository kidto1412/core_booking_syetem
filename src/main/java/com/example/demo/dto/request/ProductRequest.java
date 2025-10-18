package com.example.demo.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductRequest {
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String type;

    @NotBlank
    @Size(max = 100)
    private String description;

    @NotBlank
    private BigDecimal base_price;

    @NotBlank
    private Long user_id;

}
