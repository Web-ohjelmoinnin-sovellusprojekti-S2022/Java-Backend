package com.groupnine.project.Data.V8;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatev8countries")
public class ClimateV8countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;

    public int getId() {
        return this.id;
    }

    public String getCountry() {
        return this.country;
    }

}
