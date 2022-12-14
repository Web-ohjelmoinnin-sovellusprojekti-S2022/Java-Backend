package com.groupnine.project.Data.V3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata3_monthly")
public class ClimateV3monthly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String year;
    private double mean;

    public String getYear() {
        return this.year;
    }

    public double getMean() {
        return this.mean;
    }
    
    
}
