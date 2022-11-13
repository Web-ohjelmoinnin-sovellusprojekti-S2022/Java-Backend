package com.groupnine.project.Data.V2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata2")
public class ClimateV2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private double t;


    public int getYear() {
        return this.year;
    }

    public double get_t() {
        return this.t;
    }

    
}
