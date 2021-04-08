package com.company.exercise7;

import java.util.ArrayList;

public class FlyBird {
    public static void main(String[] args) {
        ArrayList<Bird> arr = new ArrayList<Bird>();
        arr.add(new Chicken( "with feather", "lay eggs"));
        arr.add(new Penguin("with feather", "lay eggs"));
        arr.add(new Swallow("with feather", "lay eggs"));
        arr.add(new Eagle("with feather", "lay eggs"));

        for (Bird bird : arr) {
            System.out.println(bird);
            bird.fly();
        }

    }
}
