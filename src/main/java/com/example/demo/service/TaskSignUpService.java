package com.example.demo.service;

import com.example.demo.entity.TaskEntity;
import com.example.demo.entity.TaskSignUpEntity;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.TaskSignUpRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskSignUpService {

    @Autowired
    private TaskSignUpRepository taskSignUpRepository;

    @Autowired
    private UserRepository userRepository;



    public TaskSignUpEntity createTaskSignUp(TaskSignUpEntity task) {
//        if (task.getCreatedBy() == null || task.getCreatedBy().getId() == null) {
//            throw new IllegalArgumentException("CreatedBy user must be provided");
//        }
//        userRepository.findById(task.getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
        return taskSignUpRepository.save(task);
    }


    public List<TaskSignUpEntity> getAllTaskSignUps() {
        return taskSignUpRepository.findAll();
    }

}
