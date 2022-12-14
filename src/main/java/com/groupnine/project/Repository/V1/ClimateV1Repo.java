package com.groupnine.project.Repository.V1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V1.ClimateV1;

@Repository
public interface ClimateV1Repo extends JpaRepository<ClimateV1, Integer>{
    
}
