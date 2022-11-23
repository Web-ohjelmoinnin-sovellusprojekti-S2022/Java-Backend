package com.groupnine.project.Data.V4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;



@Entity
@Table(name="climatedata4")
public class ClimateV4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private Integer DE08_year;
    @Nullable
    private Double DE08_ppm;
    @Nullable
    private Integer DE082_year;
    @Nullable
    private Double DE082_ppm;
    @Nullable
    private Integer DSS_year;
    @Nullable
    private Double DSS_ppm;


    //data for V4 "Historical CO2 record from the Law Dome DE08, DE08-2, and DSS ice cores ": https://cdiac.ess-dive.lbl.gov/ftp/trends/co2/lawdome.combined.dat


    public ClimateV4() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDE08_year() {
        return this.DE08_year;
    }

    public Double getDE08_ppm() {
        return this.DE08_ppm;
    }

    public Integer getDE082_year() {
        return this.DE082_year;
    }

    
    public Double getDE082_ppm() {
        return this.DE082_ppm;
    }

    public Integer getDSS_year() {
        return this.DSS_year;
    }

    public Double getDSS_ppm() {
        return this.DSS_ppm;
    }

}
