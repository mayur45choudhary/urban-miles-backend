package com.car.rental.urban.miles.repository;

import com.car.rental.urban.miles.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId); // user ke bookings
}