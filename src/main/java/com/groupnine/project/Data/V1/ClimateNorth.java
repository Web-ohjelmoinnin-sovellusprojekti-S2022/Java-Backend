package com.groupnine.project.Data.V1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="climatedata_northern")
public class ClimateNorth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private double anomaly;
    private double lower;
    private double upper;


    public ClimateNorth() {
    }
    
    public ClimateNorth(int year, double anomaly, double lower, double upper) {
        this.year = year;
        this.anomaly = anomaly;
        this.lower = lower;
        this.upper = upper;
    }

    public int getYear() {
        return this.year;
    }

    public double getAnomaly() {
        return this.anomaly;
    }

    public double getLower() {
        return this.lower;
    }

    public double getUpper() {
        return this.upper;
    }

}
