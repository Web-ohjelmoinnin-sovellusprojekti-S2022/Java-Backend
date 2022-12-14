package com.groupnine.project.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.HttpParser;
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

import com.groupnine.project.Data.Client;
import com.groupnine.project.Data.Customview;
import com.groupnine.project.Data.V1.ClimateGlobal;
import com.groupnine.project.Data.V1.ClimateNorth;
import com.groupnine.project.Data.V1.ClimateSouth;
import com.groupnine.project.Data.V1.ClimateV1;
import com.groupnine.project.Data.V1.ClimateV1monthly;
import com.groupnine.project.Data.V10.ClimateV10;
import com.groupnine.project.Data.V2.ClimateV2;
import com.groupnine.project.Data.V3.ClimateV3;
import com.groupnine.project.Data.V3.ClimateV3monthly;
import com.groupnine.project.Data.V4.ClimateV4;
import com.groupnine.project.Data.V5.ClimateV5;
import com.groupnine.project.Data.V6.ClimateV6;
import com.groupnine.project.Data.V7.ClimateV7;
import com.groupnine.project.Data.V8.ClimateV8;
import com.groupnine.project.Data.V8.ClimateV8countries;
import com.groupnine.project.Data.V9.ClimateV9sector;
import com.groupnine.project.Data.V9.ClimateV9subSector;
import com.groupnine.project.Data.V9.ClimateV9subSectorDetail;
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
    @GetMapping("/v8/climateV8")
    public List<ClimateV8> getClimateV8() {
        return myService.getClimateV8();
    }

    @CrossOrigin
    @GetMapping("/v8/climateV8countries")
    public List<ClimateV8countries> getClimateV8countries() {
        return myService.getClimateV8countries();
    }

    @CrossOrigin
    @GetMapping("/v9/climateV9sector")
    public List<ClimateV9sector> getClimateV9sector() {
        return myService.getClimateV9sector();
    }

    @CrossOrigin
    @GetMapping("/v9/climateV9subSector")
    public List<ClimateV9subSector> getClimateV9subSector() {
        return myService.getClimateV9subSector();
    }

    @CrossOrigin
    @GetMapping("/v9/climateV9subSectorDetail")
    public List<ClimateV9subSectorDetail> getClimateV9subSectorDetail() {
        return myService.getClimateV9subSectorDetail();
    }

    @CrossOrigin
    @GetMapping("/v10/climateV10")
    public List<ClimateV10> getClimateV10() {
        return myService.getClimateV10();
    }

    //Palauttaa kaikki tietokannasta löytyvät omat näkymät

    @CrossOrigin
    @GetMapping("customview")
    public List<Customview> getCustomView() {
        return myService.getCustomview();
    }

    //Palauttaa tietokannasta ID:llä löytyvän oman näkymän

    @CrossOrigin
    @GetMapping("customview/id")
    public Customview getCustomViewById(@RequestParam Integer id) {
        return myService.getCustomviewById(id);
    }

    //Palauttaa tietokannasta kaikki annetun käyttäjän omat näkymät.

    @CrossOrigin
    @GetMapping("customview/owner")
    public List<Customview> getCustomviewByOwner(@RequestParam String owner){
        return myService.getViewsByOwner(owner);
    }

    //Luo tietokantaan oman näkymän syötetyillä tiedoilla.

    @CrossOrigin
    @PostMapping("customview/create")
    public ResponseEntity<String> createCustomView(
            @RequestParam String owner,
            @RequestParam Boolean V1,
            @RequestParam Boolean V3,
            @RequestParam Boolean V5,
            @RequestParam Boolean V6,
            @RequestParam Boolean V7,
            @RequestParam Boolean V8,
            @RequestParam Boolean V9,
            @RequestParam String V1text,
            @RequestParam String V3text,
            @RequestParam String V5text,
            @RequestParam String V6text,
            @RequestParam String V7text,
            @RequestParam String V8text,
            @RequestParam String V9text,
            @RequestParam Boolean gridView) {
        
        myService.createView(owner, V1, V3, V5, V6, V7, V8, V9, gridView, V1text, V3text, V5text, V6text, V7text, V8text, V9text);        
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    //Poistaa tietokannasta oman näkymän ID:n perusteella.

    @CrossOrigin
    @PostMapping("customview/delete")
    public ResponseEntity<String> deleteCustomView(@RequestParam int id){
        myService.deleteView(id);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    //Poistaa tietokannasta kaikki annetun käyttäjän näkymät.

    @CrossOrigin
    @PostMapping("customview/deletebyowner")
    public ResponseEntity<String> deleteCustomViewByOwner(@RequestParam String token){
        myService.deleteViewByOwner(token);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    //Palauttaa kaikki käyttäjät.

    @CrossOrigin
    @GetMapping("user")
    public List<Client> getUsers() {
        return myService.getUsers();
    }

    //Lisää käyttäjän tietokantaan

    @PostMapping("useradd")
    public String addUser(@RequestBody Client user) {
        myService.saveUser(user);
        return "OK";
    }

    //Poistaa käyttäjän tietokannasta tokenin perusteella.

    @CrossOrigin
    @PostMapping("deleteuser")
    public ResponseEntity<String> deleteUser(@RequestHeader("Authorization") String bearer) {
        String token = bearer.split(" ")[1];
        String user = myService.validatejwt(token);
        if (user == null) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        } else {
            myService.deleteUser(user);
            return new ResponseEntity<>("Ok", HttpStatus.OK);
        }
    }

    //Luo käyttäjän tietokantaan, ja luo tokenin.

    @CrossOrigin
    @PostMapping("register")
    public ResponseEntity<String> register(@RequestParam String user, @RequestParam String password) {
        if (myService.getUserByName(user) == null) {
            Client u = myService.register(user, password);
            return new ResponseEntity<>(u.getUsername(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User already exists", HttpStatus.FORBIDDEN);
        }

    }

    //Kirjautuu sisälle. Tarkistaa käyttäjänimen ja salasanan. Jos käyttäjänimi ja salasana on oikein, palauttaa tokenin.

    @CrossOrigin
    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String user, @RequestParam String password) {
        String token = myService.login(user, password);

        if (token == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    //Tarkistaa, löytyykö tokenilla käyttäjätiliä vai ei.

    @CrossOrigin
    @GetMapping("private")
    public ResponseEntity<String> getPrivateData(@RequestHeader("Authorization") String bearer) {
        if (bearer.startsWith("Bearer")) {
            String token = bearer.split(" ")[1];
            String username = myService.validatejwt(token);
            if (username != null) {
                return new ResponseEntity<>(username, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

}
