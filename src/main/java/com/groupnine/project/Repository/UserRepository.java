package com.groupnine.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupnine.project.Data.Client;

@Repository
public interface UserRepository extends JpaRepository<Client, String>{

    // Etsii käyttäjän käyttäjänimen perusteella
    Client findByUsername(String username);

    // Poistaa käyttäjän käyttäjänimen perusteella
    String deleteByUsername(String username);
}
