package com.groupnine.project.Repository.V4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V4.ClimateV4;

@Repository
public interface ClimateV4Repo extends JpaRepository<ClimateV4, Integer>{
    
}
