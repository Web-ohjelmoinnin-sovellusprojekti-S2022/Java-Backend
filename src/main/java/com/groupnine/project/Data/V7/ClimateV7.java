package com.groupnine.project.Data.V7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata7")
public class ClimateV7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year1;
    private double temp1;
    private int year2;
    private double ppm2;

  


    public int getId() {
        return this.id;
    }

    public int getYear1() {
        return this.year1;
    }

    public double getTemp1() {
        return this.temp1;
    }

    public int getYear2() {
        return this.year2;
    }

    public double getPpm2() {
        return this.ppm2;
    }


}