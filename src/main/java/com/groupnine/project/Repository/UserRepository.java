package com.groupnine.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupnine.project.Data.Client;

@Repository
public interface UserRepository extends JpaRepository<Client, String>{

    //@Query("SELECT u FROM user u WHERE user = ?1")
    Client findByUsername(String username);

    String deleteByUsername(String username);
}
