package com.reception_app.reception_backend.controller;

import com.reception_app.reception_backend.entity.User;
import com.reception_app.reception_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService userService;

    // Add new employee
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // Add more than 1 employee
    @PostMapping("/addUsers")
    public List<User> addAllEmployees(@RequestBody List<User> users) {
        return userService.addAllEmployees(users);
    }

    // Get employee by Id
    @GetMapping("/getEmployeeByID/{id}")
    public User getEmployeeById(@PathVariable int id) {
        return userService.getEmployeeByID(id);
    }

    // Get employee by name
    @GetMapping("/getEmployeeByName/{name}")
    public User getEmployeeByName(@PathVariable String name) {
        return userService.getEmployeeByName(name);
    }

    // Update employee
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // Delete employee


    // Get all employee
    @GetMapping("/getAll")
    public List<User> getAllEmployee() {
        return userService.getAllUser();
    }
}






