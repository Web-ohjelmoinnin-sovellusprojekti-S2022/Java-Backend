package com.groupnine.project.Repository.V3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V3.ClimateV3monthly;

@Repository
public interface ClimateV3monthlyRepo extends JpaRepository<ClimateV3monthly, String>{
    
}
