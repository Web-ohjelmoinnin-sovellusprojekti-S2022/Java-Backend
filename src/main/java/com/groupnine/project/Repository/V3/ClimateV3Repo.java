package com.groupnine.project.Repository.V3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V3.ClimateV3;

@Repository
public interface ClimateV3Repo extends JpaRepository<ClimateV3, Integer>{
    
}
