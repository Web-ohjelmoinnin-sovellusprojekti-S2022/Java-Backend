package com.groupnine.project.Repository.V6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V6.ClimateV6;

@Repository
public interface ClimateV6Repo extends JpaRepository<ClimateV6, Integer>{
    
}
