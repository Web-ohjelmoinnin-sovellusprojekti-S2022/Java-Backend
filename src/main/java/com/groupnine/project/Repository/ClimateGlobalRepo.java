package com.groupnine.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupnine.project.Data.ClimateGlobal;
public interface ClimateGlobalRepo extends JpaRepository<ClimateGlobal, Integer> {
    
}
