package com.example.demo.service;

import com.example.demo.entity.TaskEntity;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    // Create Task
    public TaskEntity createTask(TaskEntity task) {
//        if (task.getCreatedBy() == null || task.getCreatedBy().getId() == null) {
//            throw new IllegalArgumentException("CreatedBy user must be provided");
//        }
//        userRepository.findById(task.getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
        return taskRepository.save(task);
    }

    // Get All Tasks
    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get Task by ID
    public TaskEntity getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }



    public TaskEntity deleteTask(Long id) {
        TaskEntity task=taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        taskRepository.deleteById(id);
        return task;
    }




}