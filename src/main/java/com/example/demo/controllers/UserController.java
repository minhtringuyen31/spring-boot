package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model){
        List<UserModel> listUsers = service.listAll();
        System.out.println(listUsers.toString());
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
    @GetMapping("/users/{id}")
    public
}
