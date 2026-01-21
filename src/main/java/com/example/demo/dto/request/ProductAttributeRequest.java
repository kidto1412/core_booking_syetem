package com.example.demo.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductAttributeRequest {
    @NotBlank
    @Size(max = 100)
    private LocalDate start_date;

    @NotBlank
    @Size(max = 100)
    private LocalDate end_date;

    @NotBlank
    @Size(max = 100)
    private String item_type;

    @NotBlank
    private BigDecimal price;

    @NotBlank
    private Integer quantity;

    @NotBlank
    private Long product_id;

    @NotBlank
    private Long booking_id;
}
