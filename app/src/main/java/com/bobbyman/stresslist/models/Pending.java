package com.bobbyman.stresslist.models;

import com.orm.SugarRecord;

/**
 * Created by Bobby1982 on 08-11-2016.
 */

public class Pending extends SugarRecord{
    private String name, description;
    private boolean done;

    public Pending() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

