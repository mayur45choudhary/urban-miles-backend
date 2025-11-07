package com.car.rental.urban.miles.controller;

import com.car.rental.urban.miles.entity.Car;
import com.car.rental.urban.miles.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "*")  // allow frontend requests
public class CarController {

    @Autowired
    private CarRepository carRepository;

    // Add Car
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    // Get All Cars
    @GetMapping
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    // Delete Car
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
    }
}
