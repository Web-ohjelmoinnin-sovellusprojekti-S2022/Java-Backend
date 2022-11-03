package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.groupnine.project.Data.User;

import service.Services;

@RestController
public class RESTController {
    @Autowired
    private Services myService;

    @GetMapping("User")
    public  List<User> getUsers() {
        return myService.getUsers();
    }

    @PostMapping("addUser")
    public String addUser(@RequestParam String user, @RequestParam String password){
        myService.addUser(user, password);
        return "OK";
    }
}
