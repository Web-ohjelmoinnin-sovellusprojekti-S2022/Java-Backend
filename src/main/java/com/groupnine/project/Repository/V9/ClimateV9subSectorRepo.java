package com.groupnine.project.Repository.V9;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V9.ClimateV9subSector;

@Repository
public interface ClimateV9subSectorRepo extends JpaRepository<ClimateV9subSector, Integer>{
    
}
