package com.car.rental.urban.miles.repository;

//package com.car.rental.urban.miles.repository;

import com.car.rental.urban.miles.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
