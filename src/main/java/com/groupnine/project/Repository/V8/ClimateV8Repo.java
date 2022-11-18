package com.groupnine.project.Repository.V8;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V8.ClimateV8;

@Repository
public interface ClimateV8Repo extends JpaRepository<ClimateV8, Integer>{
    
}
