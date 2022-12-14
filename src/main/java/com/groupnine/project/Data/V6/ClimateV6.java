package com.groupnine.project.Data.V6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata6")
public class ClimateV6 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double year;
    private double co2_ppm;

    public double getYear() {
        return this.year;
    }

    public double getCo2_ppm() {
        return this.co2_ppm;
    }



}