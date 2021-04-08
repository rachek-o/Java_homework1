package com.company.exercise7;
import java.util.ArrayList;
public abstract class Bird {

    public String feathers;
    public String layEggs;
    public String kind;

    public Bird(String kind, String feathers, String layEggs) {
        this.kind = kind;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getKind() {
        return kind;
    }

    public String getFeathers() {
        return feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public String toString() {
        return kind + " " + feathers + " " + layEggs;
    }
}








































