package com.company.exercise7;

public class NonFlyingBird extends Bird {
    public void fly() {
        System.out.println("I am not able to fly");
    }

    public NonFlyingBird(String kind, String feathers, String layEggs) {
        super(kind, feathers, layEggs);
    }
}