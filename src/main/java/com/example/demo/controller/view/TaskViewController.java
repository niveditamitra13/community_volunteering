package com.example.demo.controller.view;

import com.example.demo.entity.TaskEntity;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskViewController {

    @Autowired
    private TaskService taskService;

    // Display all tasks
    @GetMapping("/search")
    public String showAllTasks(@org.jetbrains.annotations.NotNull Model model) {
       List<TaskEntity> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "search"; // Refers to `search.html` in the `templates` directory
    }

}

