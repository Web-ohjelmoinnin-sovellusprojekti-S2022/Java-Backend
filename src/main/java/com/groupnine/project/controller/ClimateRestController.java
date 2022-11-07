package com.groupnine.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupnine.project.Data.User;
import com.groupnine.project.service.Services;

@RestController
public class ClimateRestController {
    
    @Autowired
    private Services myService;

    @GetMapping("user")
    public List<User> getUsers() {
        return myService.getUsers();
    }

    @PostMapping("useradd")
    public String addUser(@RequestBody User user){
        myService.saveUser(user);
        return "OK";
    }
}
