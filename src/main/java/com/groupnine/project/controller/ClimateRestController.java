package com.groupnine.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupnine.project.Data.User;
import com.groupnine.project.Data.ClimateGlobal;
import com.groupnine.project.Data.ClimateNorth;
import com.groupnine.project.Data.ClimateSouth;
import com.groupnine.project.service.Services;

@RestController
public class ClimateRestController {
    
    @Autowired
    Services myService;

    @CrossOrigin
    @GetMapping("/v1/climateNorth")
    public List<ClimateNorth> getClimateNorth() {
        return myService.getClimateNorth();
    }

    @CrossOrigin
    @GetMapping("/v1/climateSouth")
    public List<ClimateSouth> getClimateSouth() {
        return myService.getClimateSouth();
    }

    @CrossOrigin
    @GetMapping("/v1/climateGlobal")
    public List<ClimateGlobal> getClimateGlobal() {
        return myService.getClimateGlobal();
    }
    
    @CrossOrigin
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
