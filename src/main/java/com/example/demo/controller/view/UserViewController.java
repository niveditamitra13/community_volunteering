package com.example.demo.controller.view;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserViewController {

    @Autowired
    private UserService userService;

    // Render all users
    @GetMapping
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users"; // Refers to `users.html` template in `templates/`
    }

    // Render form to create a new user
    @GetMapping("/new")
    public String showCreateUserForm(Model model) {
        model.addAttribute("user", new UserEntity());
        return "user_registration"; // Refers to `user_registration.html` template
    }

    // Handle form submission to create a new user
    @PostMapping
    public String createUser(@ModelAttribute UserEntity user, Model model) {
        userService.createUser(user);
        model.addAttribute("newUser", user);
        return "redirect:/tasks/search"; // Redirect to all users after creation
    }


    @GetMapping("/login")
    public String login(Model model) {
        return "login"; // Refers to `users.html` template in `templates/`
    }
}
