package com.groupnine.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.groupnine.project.Data.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
