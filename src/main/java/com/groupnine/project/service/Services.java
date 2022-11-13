package com.groupnine.project.service;


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
import com.groupnine.project.Repository.UserRepository;
import com.groupnine.project.Repository.V1.ClimateGlobalRepo;
import com.groupnine.project.Repository.V1.ClimateNorthRepo;
import com.groupnine.project.Repository.V1.ClimateSouthRepo;
import com.groupnine.project.Repository.V1.ClimateV1Repo;
import com.groupnine.project.Repository.V1.ClimateV1monthlyRepo;




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

    //User
    public void saveUser(User user){
        userRepository.save(user);
    }
    
    public List<User> getUsers(){
        return userRepository.findAll();
    }


}
