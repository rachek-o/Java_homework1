package com.company.exercise7;

public class FlyingBird extends Bird {
    public void fly() {
        System.out.println("I can fly");
    }

    public FlyingBird(String kind, String feathers, String layEggs) {
        super(kind, feathers, layEggs);
    }
}