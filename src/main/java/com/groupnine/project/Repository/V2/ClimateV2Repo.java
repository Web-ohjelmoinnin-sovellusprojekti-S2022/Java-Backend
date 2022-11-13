package com.groupnine.project.Repository.V2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V2.ClimateV2;

@Repository
public interface ClimateV2Repo extends JpaRepository<ClimateV2, Integer>{
    
}
