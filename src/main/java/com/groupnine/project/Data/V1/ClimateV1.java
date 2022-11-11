package com.groupnine.project.Data.V1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata_v1")
public class ClimateV1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private double anomaly_g;
    private double anomaly_n;
    private double anomaly_s;


    public int getYear() {
        return this.year;
    }

    public double getAnomaly_g() {
        return this.anomaly_g;
    }

    public double getAnomaly_n() {
        return this.anomaly_n;
    }

    public double getAnomaly_s() {
        return this.anomaly_s;
    }
    
}
