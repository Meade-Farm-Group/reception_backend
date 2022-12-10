package com.reception_app.reception_backend.service;

import com.reception_app.reception_backend.dao.UserRepository;
import com.reception_app.reception_backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> addAllEmployees(List<User> users){
        return userRepository.saveAll(users);
    }

    public User getEmployeeByID(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User getEmployeeByName(String name){
        return userRepository.findByName(name);
    }

    public User updateUser(User user){
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        System.out.println(user);
        if(existingUser == null){
            System.err.println("User not found ");
            return userRepository.save(user);
        }else{
            existingUser.setName(user.getName());
            existingUser.setArea(user.getArea());
            existingUser.setDeparture_time(user.getDeparture_time());
        }
        return user;
    }


    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
