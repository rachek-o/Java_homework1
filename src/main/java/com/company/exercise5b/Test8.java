package com.company.exercise5b;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());
        int z = Integer.parseInt(in.nextLine());
        int max = Math.max(x, y);
        if (max > y) {
            max = Math.max(x, z);
        } else {
            max = Math.max(y, z);

            System.out.println("The max of three is: " + max);
        }
        int min = Math.min(x, y);
        if (min < y) {
            min = Math.min(x, z);
        } else {
            min = Math.min(y, z);
        }
        System.out.println("The min of three is: " + min);
    }
}
