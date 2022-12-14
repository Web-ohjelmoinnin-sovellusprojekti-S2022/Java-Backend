package com.groupnine.project.Data.V10;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="climatedata10")
public class ClimateV10 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Nullable
    private Integer year;
    private int years_ago;
    private String event;

    public int getId() {
        return this.id;
    }

    public Integer getYear() {
        return this.year;
    }

    public int getYears_ago() {
        return this.years_ago;
    }

    public String getEvent() {
        return this.event;
    }

}
