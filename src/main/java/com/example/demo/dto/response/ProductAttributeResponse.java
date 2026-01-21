package com.example.demo.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductAttributeResponse {
    private Long id;
    private LocalDate created_at;
    private String status;
    private BigDecimal total_price;
    private Long user_id;
}
