package com.example.demo.controller;

import com.example.demo.entity.TaskEntity;
import com.example.demo.entity.TaskSignUpEntity;
import com.example.demo.service.TaskService;
import com.example.demo.service.TaskSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasksignup")
public class TaskSignUpController {

    @Autowired
    private TaskSignUpService taskSignUpService;


    @PostMapping
    public TaskSignUpEntity createTaskSignup(@RequestBody TaskSignUpEntity task) {
        return taskSignUpService.createTaskSignUp(task);
    }


    @GetMapping
    public List<TaskSignUpEntity> getAllTaskSignUps() {
        return taskSignUpService.getAllTaskSignUps();
    }


//    @GetMapping("/{id}")
//    public TaskEntity getTaskById(@PathVariable Long id) {
//        return taskService.getTaskById(id);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public TaskEntity deleteTask(@PathVariable Long id) {
//        return taskService.deleteTask(id);
//
//    }

//    @PutMapping
//    public TaskEntity editTask(@RequestBody TaskEntity requestedTask) {
//        return taskService.editTask(requestedTask);
//
//    }


}

