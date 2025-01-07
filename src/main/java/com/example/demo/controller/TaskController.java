package com.example.demo.controller;

import com.example.demo.entity.TaskEntity;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Create Task
    @PostMapping
    public TaskEntity createTask(@RequestBody TaskEntity task) {
        return taskService.createTask(task);
    }

    // Get All Tasks
    @GetMapping
    public List<TaskEntity> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Get Task by ID
    @GetMapping("/{id}")
    public TaskEntity getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }


    @DeleteMapping("/{id}")
    public TaskEntity deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);

    }


}
