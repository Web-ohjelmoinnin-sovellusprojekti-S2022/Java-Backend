package com.groupnine.project.Repository.V7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V7.ClimateV7;

@Repository
public interface ClimateV7Repo extends JpaRepository<ClimateV7, Integer>{
    
}
