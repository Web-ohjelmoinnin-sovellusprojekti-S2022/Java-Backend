package com.groupnine.project.Repository.V1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V1.ClimateGlobal;

@Repository
public interface ClimateGlobalRepo extends JpaRepository<ClimateGlobal, Integer> {
    
}
