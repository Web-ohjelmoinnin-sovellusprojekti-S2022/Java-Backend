package com.groupnine.project.Repository.V8;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.V8.ClimateV8countries;

@Repository
public interface ClimateV8countriesRepo extends JpaRepository<ClimateV8countries, Integer>{
    ClimateV8countriesRepo findByCountry(String c);
}
