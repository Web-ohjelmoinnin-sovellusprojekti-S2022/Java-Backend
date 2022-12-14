package com.groupnine.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupnine.project.Data.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    //@Query("SELECT u FROM user u WHERE user = ?1")
    User findByUsername(String username);

    String deleteByUsername(String username);
}
