package com.example.demo.controller.view;

import com.example.demo.entity.TaskEntity;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable Long id, Model model) {
        TaskEntity task = taskService.getTaskById(id); // Fetch task from DB
        model.addAttribute("task", task);
        return "task-details"; // Thymeleaf template for single task
    }



    //for org

    @GetMapping("/create")
    public String showCreateTaskForm(Model model) {
        model.addAttribute("task", new TaskEntity());
        return "createTask";
    }

    @PostMapping("/create")
    public String createTask(TaskEntity task, Model model) {
        taskService.createTask(task);
        model.addAttribute("success", "Task created successfully!");
        return "redirect:/tasks/alltasks";
    }

    @GetMapping("/alltasks")
    public String showAllTasksforOrg(@org.jetbrains.annotations.NotNull Model model) {
        List<TaskEntity> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "alltasks"; // Refers to `search.html` in the `templates` directory
    }

}

