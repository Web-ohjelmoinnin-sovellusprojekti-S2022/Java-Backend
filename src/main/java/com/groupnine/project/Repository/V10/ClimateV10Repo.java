package com.groupnine.project.Repository.V10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V10.ClimateV10;

@Repository
public interface ClimateV10Repo extends JpaRepository<ClimateV10, Integer>{
    
}
