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
import com.groupnine.project.Data.V2.ClimateV2;
import com.groupnine.project.Data.V3.ClimateV3;
import com.groupnine.project.Data.V3.ClimateV3monthly;
import com.groupnine.project.Data.V4.ClimateV4;
import com.groupnine.project.Data.V5.ClimateV5;
import com.groupnine.project.Data.V6.ClimateV6;
import com.groupnine.project.Data.V7.ClimateV7;
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
    @GetMapping("/v2/climateV2")
    public List<ClimateV2> getClimateV2() {
        return myService.getClimateV2();
    }

    @CrossOrigin
    @GetMapping("/v3/climateV3")
    public List<ClimateV3> getClimateV3() {
        return myService.getClimateV3();
    }

    @CrossOrigin
    @GetMapping("/v3/climateV3monthly")
    public List<ClimateV3monthly> getClimateV3monthly() {
        return myService.getClimateV3monthly();
    }

    @CrossOrigin
    @GetMapping("/v4/climateV4")
    public List<ClimateV4> getClimateV4() {
        return myService.getClimateV4();
    }



    @CrossOrigin
    @GetMapping("/v5/climateV5")
    public List<ClimateV5> getClimateV5() {
        return myService.getClimateV5();
    }

    @CrossOrigin
    @GetMapping("/v6/climateV6")
    public List<ClimateV6> getClimateV6() {
        return myService.getClimateV6();
    }

    @CrossOrigin
    @GetMapping("/v7/climateV7")
    public List<ClimateV7> getClimateV7() {
        return myService.getClimateV7();
    }
    

    @CrossOrigin
    @GetMapping("user")
    public List<User> getUsers() {
        return myService.getUsers();
    }

    @PostMapping("useradd")
    public String addUser(@RequestBody User user) {
        myService.saveUser(user);
        return "OK";
    }

    @CrossOrigin
    @PostMapping("register")
    public ResponseEntity<String> register(@RequestParam String user, @RequestParam String password) {
        if (myService.getUserByName(user) == null) {
            User u = myService.register(user, password);
            return new ResponseEntity<>(u.getUsername(), HttpStatus.OK);
        } 
        else {
            return new ResponseEntity<>("User already exists", HttpStatus.FORBIDDEN);
        }

    }

    @CrossOrigin
    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String user, @RequestParam String password) {
        String token = myService.login(user, password);

        if (token == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("private")
    public ResponseEntity<String> getPrivateData(@RequestHeader("Authorization") String bearer) {
        if (bearer.startsWith("Bearer")) {
            String token = bearer.split(" ")[1];
            String username = myService.validatejwt(token);
            if (username != null) {
                return new ResponseEntity<>("Private Data for " + username, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

}
