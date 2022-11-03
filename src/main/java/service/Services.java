package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.groupnine.project.Data.User;

@Service
public class Services {
    public List<User> users = new ArrayList<>();
    public Services() {

    }
    public List<User> getUsers(){
        return new ArrayList<>(users);
    }

    public void addUser(String user, String password){
        User user1 = new User(user, password);
        users.add(user1);
    }
}
