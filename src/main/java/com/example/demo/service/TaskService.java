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


    public TaskEntity createTask(TaskEntity task) {
//        if (task.getCreatedBy() == null || task.getCreatedBy().getId() == null) {
//            throw new IllegalArgumentException("CreatedBy user must be provided");
//        }
//        userRepository.findById(task.getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
        return taskRepository.save(task);
    }


    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }


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


    public TaskEntity editTask(TaskEntity requestedTask) {
        TaskEntity task = taskRepository.findById(requestedTask.getId())
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(requestedTask.getTitle());
        task.setCreatedBy(requestedTask.getCreatedBy());
        task.setDescription(requestedTask.getDescription());
        task.setLocation(requestedTask.getLocation());
        task.setStatus(requestedTask.getStatus());
        task.setSkillsRequired(requestedTask.getSkillsRequired());
        return  taskRepository.save(task);

    }
}