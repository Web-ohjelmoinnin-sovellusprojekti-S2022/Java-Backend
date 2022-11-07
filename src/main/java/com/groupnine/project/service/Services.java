package com.groupnine.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupnine.project.Data.ClimateGlobal;
import com.groupnine.project.Data.ClimateNorth;
import com.groupnine.project.Data.ClimateSouth;
import com.groupnine.project.Data.User;
import com.groupnine.project.Repository.ClimateGlobalRepo;
import com.groupnine.project.Repository.ClimateNorthRepo;
import com.groupnine.project.Repository.ClimateSouthRepo;
import com.groupnine.project.Repository.UserRepository;




@Service
public class Services {
    @Autowired
    ClimateNorthRepo climateNorth;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ClimateSouthRepo climateSouth;
    @Autowired
    ClimateGlobalRepo climateglobal;


    public Services() {

    }
    

    //ClimateNorth 
    public void saveClimate(ClimateNorth e) {
        climateNorth.save(e);
    }

    public List<ClimateNorth> getClimateNorth() {
        return climateNorth.findAll();
    }

    //ClimateSouth
    public void saveClimateSouth(ClimateSouth e) {
        climateSouth.save(e);
    }
    public List<ClimateSouth> getClimateSouth() {
        return climateSouth.findAll();
    }

    //ClimateGlobal

    public void saveClimateGlobal(ClimateGlobal e){
        climateglobal.save(e);
    }

    public List<ClimateGlobal> getClimateGlobal() {
        return climateglobal.findAll();
    }

    //User
    public void saveUser(User user){
        userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
