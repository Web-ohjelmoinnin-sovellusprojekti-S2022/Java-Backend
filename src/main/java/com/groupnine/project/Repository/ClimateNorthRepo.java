package com.groupnine.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupnine.project.Data.ClimateNorth;

@Repository
public interface ClimateNorthRepo extends JpaRepository<ClimateNorth, Integer>{
    
}
