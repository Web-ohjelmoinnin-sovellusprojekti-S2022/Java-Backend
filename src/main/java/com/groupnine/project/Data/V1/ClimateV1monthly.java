package com.groupnine.project.Data.V1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="climatedata_v1_monthly")
public class ClimateV1monthly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String year;
    private double anomaly_g;
    private double anomaly_n;
    private double anomaly_s;


    public String getYear() {
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
