package com.car.rental.urban.miles.controller;

import com.car.rental.urban.miles.entity.User;
import com.car.rental.urban.miles.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    // ✅ Register new user
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepo.save(user);
    }
    public record LoginData(String email, String password) {}
    // ✅ Login
    @PostMapping("/login")
    public User loginUser(@RequestBody LoginData loginData) {
        User user = userRepo.findByEmail(loginData.email());
        if (user != null && user.getPassword().equals(loginData.password())) {
            return user;
        }
        return null; // agar email ya password galat hai
    }
}