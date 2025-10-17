package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<BookingItem> booking_items;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<Payment> payments;
    // @ManyToOne
    // private Hotel hotel;

    public enum BookingStatus {
        PENDING,
        PAID,
        CANCELLED
    }

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // PENDING, PAID, CANCELLED

    @Column(nullable = false)
    private BigDecimal total_price;

    private LocalDate createdAt;

}
