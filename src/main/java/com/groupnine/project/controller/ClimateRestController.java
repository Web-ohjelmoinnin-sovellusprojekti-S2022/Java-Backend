package com.groupnine.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.groupnine.project.Data.User;
import com.groupnine.project.Data.V1.ClimateGlobal;
import com.groupnine.project.Data.V1.ClimateNorth;
import com.groupnine.project.Data.V1.ClimateSouth;
import com.groupnine.project.Data.V1.ClimateV1;
import com.groupnine.project.Data.V1.ClimateV1monthly;
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
    @GetMapping("/v1/climateV1")
    public List<ClimateV1> getClimateV1() {
        return myService.getClimateV1();
    }

    @CrossOrigin
    @GetMapping("/v1/climateV1monthly")
    public List<ClimateV1monthly> getClimateV1monthly() {
        return myService.getClimateV1monthly();
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

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestParam String uname, @RequestParam String pw){
        User u = myService.register(uname, pw);
        return new ResponseEntity<>(u.getUsername(), HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String uname, @RequestParam String pw){
        String token = myService.login(uname, pw);

        if(token == null){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @GetMapping("private")
    public ResponseEntity<String> getPrivateData(@RequestHeader("Authorization") String bearer) {
        if(bearer.startsWith("Bearer")) {
            String token = bearer.split(" ")[1];
            String username = myService.validatejwt(token);
            if(username != null){
                return new ResponseEntity<>("Private Data for "+username, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }



}
