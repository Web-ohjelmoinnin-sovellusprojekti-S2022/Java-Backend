package com.groupnine.project.Repository.V5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V5.ClimateV5;

@Repository
public interface ClimateV5Repo extends JpaRepository<ClimateV5, Integer>{
    
}
