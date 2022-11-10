package com.groupnine.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupnine.project.Data.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
}
