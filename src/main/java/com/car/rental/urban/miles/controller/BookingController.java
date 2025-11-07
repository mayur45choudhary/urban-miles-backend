package com.car.rental.urban.miles.controller;


import com.car.rental.urban.miles.entity.Booking;
import com.car.rental.urban.miles.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepo;

    // ✅ Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    // ✅ Add new booking
    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepo.save(booking);
    }

    // ✅ Get bookings by user
    @GetMapping("/user/{userId}")
    public List<Booking> getBookingsByUser(@PathVariable Long userId) {
        return bookingRepo.findByUserId(userId);
    }
}