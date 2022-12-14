package com.groupnine.project.Data.V5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata5")
public class ClimateV5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
    private double ppmv;

    public int getId() {
        return this.id;
    }

    public int getYear() {
        return this.year;
    }

    public double getPpmv() {
        return this.ppmv;
    }


}