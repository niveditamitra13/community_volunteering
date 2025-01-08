package com.example.demo.service;


import com.example.demo.entity.TaskEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;




    public UserEntity createUser(UserEntity user) {
//        if (task.getCreatedBy() == null || task.getCreatedBy().getId() == null) {
//            throw new IllegalArgumentException("CreatedBy user must be provided");
//        }
//        userRepository.findById(task.getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
        return userRepository.save(user);
    }


    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }


    public UserEntity getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found"));
    }



    public UserEntity deleteUser(Long id) {
        UserEntity user=userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found"));
        userRepository.deleteById(id);
        return user;
    }




}
