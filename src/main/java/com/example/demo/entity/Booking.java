package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
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

    private LocalDate createdAt;

    // private List<Hotel> hotels;

    public Booking() {
    }

    // public Booking(String name, Hotel... hotels) {
    // this.name = name;
    // this.hotels = Stream.of(hotel).collect(Collectors.toList());
    // this.hotels.forEach(x -> x.setBooking(this));
    // }
}
