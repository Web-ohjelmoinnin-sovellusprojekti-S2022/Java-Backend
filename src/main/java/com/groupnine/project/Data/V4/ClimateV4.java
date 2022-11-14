package com.groupnine.project.Data.V4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata4")
public class ClimateV4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int DE08_year;
    private double DE08_ppm;
    private int DE082_year;
    private double DE082_ppm;
    private int DSS_year;
    private double DSS_ppm;


    //data for V4 "Historical CO2 record from the Law Dome DE08, DE08-2, and DSS ice cores ": https://cdiac.ess-dive.lbl.gov/ftp/trends/co2/lawdome.combined.dat


    public ClimateV4() {
    }

    public int getId() {
        return this.id;
    }

    public int getDE08_year() {
        return this.DE08_year;
    }

    public double getDE08_ppm() {
        return this.DE08_ppm;
    }

    public int getDE082_year() {
        return this.DE082_year;
    }

    
    public double getDE082_ppm() {
        return this.DE082_ppm;
    }

    public int getDSS_year() {
        return this.DSS_year;
    }

    public double getDSS_ppm() {
        return this.DSS_ppm;
    }

}
