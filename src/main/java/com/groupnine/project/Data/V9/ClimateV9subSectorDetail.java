package com.groupnine.project.Data.V9;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata9subsectordetail")
public class ClimateV9subSectorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sub_sector_detail;
    private Double emissions;


    public int getId() {
        return this.id;
    }

    public String getSector() {
        return this.sub_sector_detail;
    }

    public Double getEmissions() {
        return this.emissions;
    }
    


}