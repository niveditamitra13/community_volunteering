package com.example.demo.controller.view;

import com.example.demo.entity.TaskSignUpEntity;
import com.example.demo.service.TaskSignUpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks/history")
public class TaskSignUpViewController {

    private final TaskSignUpService taskSignUpService;

    public TaskSignUpViewController(TaskSignUpService taskSignUpService) {
        this.taskSignUpService = taskSignUpService;
    }

    @GetMapping
    public String getAllTaskSignUps(Model model) {
        List<TaskSignUpEntity> taskSignUps = taskSignUpService.getAllTaskSignUps();
        model.addAttribute("taskSignUps", taskSignUps);
        return "taskSignUpHistory";
    }

    @DeleteMapping("/{id}")
    public String cancelTaskSignUp(@PathVariable Long id) {
        taskSignUpService.deleteTaskSignUp(id);
        return "redirect:/tasks/history";  // Redirects back to the history page after deletion
    }


}

