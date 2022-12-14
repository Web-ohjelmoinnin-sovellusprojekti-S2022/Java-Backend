package com.groupnine.project.Data.V9;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata9subsector")
public class ClimateV9subSector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sub_sector;
    private Double emissions;


    public int getId() {
        return this.id;
    }

    public String getSector() {
        return this.sub_sector;
    }

    public Double getEmissions() {
        return this.emissions;
    }
    


}