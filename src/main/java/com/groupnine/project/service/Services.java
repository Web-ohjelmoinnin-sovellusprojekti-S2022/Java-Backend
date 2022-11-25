package com.groupnine.project.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
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
import com.groupnine.project.Data.V8.ClimateV8;
import com.groupnine.project.Data.V8.ClimateV8countries;
import com.groupnine.project.Repository.UserRepository;
import com.groupnine.project.Repository.V1.ClimateGlobalRepo;
import com.groupnine.project.Repository.V1.ClimateNorthRepo;
import com.groupnine.project.Repository.V1.ClimateSouthRepo;
import com.groupnine.project.Repository.V1.ClimateV1Repo;
import com.groupnine.project.Repository.V1.ClimateV1monthlyRepo;
import com.groupnine.project.Repository.V2.ClimateV2Repo;
import com.groupnine.project.Repository.V3.ClimateV3Repo;
import com.groupnine.project.Repository.V3.ClimateV3monthlyRepo;
import com.groupnine.project.Repository.V4.ClimateV4Repo;
import com.groupnine.project.Repository.V5.ClimateV5Repo;
import com.groupnine.project.Repository.V6.ClimateV6Repo;
import com.groupnine.project.Repository.V7.ClimateV7Repo;
import com.groupnine.project.Repository.V8.ClimateV8Repo;
import com.groupnine.project.Repository.V8.ClimateV8countriesRepo;



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
    @Autowired
    ClimateV1Repo climateV1;
    @Autowired
    ClimateV1monthlyRepo climateV1monthly;
    @Autowired
    ClimateV2Repo climateV2;
    @Autowired
    ClimateV3Repo climateV3;
    @Autowired
    ClimateV3monthlyRepo climateV3monthly;
    @Autowired
    ClimateV4Repo climateV4;
    @Autowired
    ClimateV5Repo climateV5;
    @Autowired
    ClimateV6Repo climateV6;
    @Autowired
    ClimateV7Repo climateV7;
    @Autowired
    ClimateV8Repo climateV8;
    @Autowired
    ClimateV8countriesRepo climateV8countries;

    @Value("${jwt.secret}")
    private String jwtKey;


    public Services() {

    }


    //Security Register User
    public User register(String username, String password){
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
        User u = new User(username, enc.encode(password));
        userRepository.save(u);
        return u;
    }

    //Security Login User
    //Return token or null if not found or password wrong.
    public String login(String username, String password) {
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
        User u = userRepository.findById(password).orElse(null);

        if(u == null || !enc.matches(password, u.getPassword())){
            return null;
        }

        Algorithm alg = Algorithm.HMAC256(jwtKey);
        return JWT.create().withSubject(username).sign(alg);
    }
    /**
     * verify jwt token and return username if token is valid
     * @param jwtToken
     * @return
     */
    public String validatejwt(String jwtToken){
        Algorithm alg = Algorithm.HMAC256(jwtKey);
        JWTVerifier verifier = JWT.require(alg).build();

        try {
            DecodedJWT jwt = verifier.verify(jwtToken);
            return jwt.getSubject();
        } catch (JWTVerificationException e) {
        }

        return null;
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

    //ClimateV1

    public void saveClimateV1(ClimateV1 e){
        climateV1.save(e);
    }

    public List<ClimateV1> getClimateV1() {
        return climateV1.findAll();
    }

    //ClimateV1monthly

    public void saveClimateV1monthly(ClimateV1monthly e){
        climateV1monthly.save(e);
    }

    public List<ClimateV1monthly> getClimateV1monthly() {
        return climateV1monthly.findAll();
    }

    //ClimateV2
    
    public void saveClimateV2(ClimateV2 e){
        climateV2.save(e);
    }

    public List<ClimateV2> getClimateV2() {
        return climateV2.findAll();
    }

    //climateV3

    public void saveClimateV3(ClimateV3 e){
        climateV3.save(e);
    }

    public List<ClimateV3> getClimateV3() {
        return climateV3.findAll();
    }

    //climateV3monthly

    public void saveClimateV3monthly(ClimateV3monthly e){
        climateV3monthly.save(e);
    }

    public List<ClimateV3monthly> getClimateV3monthly() {
        return climateV3monthly.findAll();
    }

    
    //ClimateV4
    
    public void saveClimateV4(ClimateV4 e){
        climateV4.save(e);
    }

    public List<ClimateV4> getClimateV4() {
        return climateV4.findAll();
    }

      //ClimateV5
    
      public void saveClimateV5(ClimateV5 e){
        climateV5.save(e);
    }

    public List<ClimateV5> getClimateV5() {
        return climateV5.findAll();
    }

    //ClimateV6
    
    public void saveClimateV6(ClimateV6 e){
        climateV6.save(e);
    }

    public List<ClimateV6> getClimateV6() {
        return climateV6.findAll();
    }

    //ClimateV7

    public void saveClimateV7(ClimateV7 e){
        climateV7.save(e);
    }

    public List<ClimateV7> getClimateV7() {
        return climateV7.findAll();
    }

    //ClimateV8

    public void saveClimateV8(ClimateV8 e){
        climateV8.save(e);
    }

    public List<ClimateV8> getClimateV8() {
        return climateV8.findAll();
    }

    //ClimateV8countries

    public void saveClimateV8countries(ClimateV8countries e){
        climateV8countries.save(e);
    }

    public List<ClimateV8countries> getClimateV8countries() {
        return climateV8countries.findAll();
    }

    //User
    public void saveUser(User user){
        userRepository.save(user);
    }
    
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public String getUserByName(String n){
        User user = userRepository.findByUsername(n);
        if (userRepository.findByUsername(n) != null){
            return user.getUsername();
        }
        else {
            return null;
        }
        
    }
}
