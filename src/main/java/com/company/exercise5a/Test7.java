package com.company.exercise5a;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input float: ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float z = in.nextFloat();

        if (x > -5 && x < 5 && y > -5 && y < 5 && z > -5 && z < 5) {
            System.out.println("All floats are belong to the range [-5,5]");
        } else {
            System.out.println("Not all floats are belong to the range [-5,5]");
        }

    }
}

