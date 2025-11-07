package com.car.rental.urban.miles.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long carId;
    private String startDate;
    private String endDate;
    private String pickupLocation;
    private String dropLocation;
}