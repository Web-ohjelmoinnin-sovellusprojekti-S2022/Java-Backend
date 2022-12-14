package com.groupnine.project.Data.V3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata3")
public class ClimateV3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private double mean;

    public ClimateV3() {
    }

    public int getYear() {
        return this.year;
    }

    public double get_mean() {
        return this.mean;
    }
    
}
