package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupnine.project.Data.User;
import com.groupnine.project.Repository.UserRepository;

@Service
public class Services {
    @Autowired
    UserRepository userRepository;
    public Services() {
        System.out.println(getUsers());
    }
    public void saveUser(User user){
        userRepository.save(user);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
