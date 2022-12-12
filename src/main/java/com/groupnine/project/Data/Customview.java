package com.groupnine.project.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String owner;

    private boolean V1;
    private boolean V3;
    private boolean V5;
    private boolean V6;
    private boolean V7;
    private boolean V8;
    private boolean V9;
    private boolean gridview;

    private String V1text;
    private String V3text;
    private String V5text;
    private String V6text;
    private String V7text;
    private String V8text;
    private String V9text;
    

    public int getId() {
        return this.id;
    }

    public String getOwner() {
        return this.owner;
    }

    public boolean getV1() {
        return this.V1;
    }

    public boolean isV1() {
        return this.V1;
    }

    public boolean getV3() {
        return this.V3;
    }

    public boolean isV3() {
        return this.V3;
    }

    public boolean getV5() {
        return this.V5;
    }

    public boolean isV5() {
        return this.V5;
    }

    public boolean getV6() {
        return this.V6;
    }

    public boolean isV6() {
        return this.V6;
    }

    public boolean getV7() {
        return this.V7;
    }

    public boolean isV7() {
        return this.V7;
    }

    public boolean getV8() {
        return this.V8;
    }

    public boolean isV8() {
        return this.V8;
    }

    public boolean getV9() {
        return this.V9;
    }

    public boolean isV9() {
        return this.V9;
    }

    public boolean getGridview() {
        return this.gridview;
    }

    public boolean isGridview() {
        return this.gridview;
    }

    public String getV1text() {
        return this.V1text;
    }

    public String getV3text() {
        return this.V3text;
    }

    public String getV5text() {
        return this.V5text;
    }

    public String getV6text() {
        return this.V6text;
    }

    public String getV7text() {
        return this.V7text;
    }

    public String getV8text() {
        return this.V8text;
    }

    public String getV9text() {
        return this.V9text;
    }

    

}

