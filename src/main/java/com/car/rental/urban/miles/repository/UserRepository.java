package com.car.rental.urban.miles.repository;

import com.car.rental.urban.miles.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // login ke liye
}