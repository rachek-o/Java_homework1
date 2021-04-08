package com.company.exercise1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, a, b, c;
        int a1, a2, i;
        System.out.print("Enter x ");
        x = sc.nextDouble();
        System.out.print("Enter y ");
        y = sc.nextDouble();
        System.out.print("Enter a ");
        a = sc.nextDouble();
        System.out.print("Enter b ");
        b = sc.nextDouble();
        System.out.print("Enter c ");
        c = sc.nextDouble();

        if (x >= a) {
            if (y >= b || y >= c) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        if (y >= a) {
            if (x >= b || x >= c) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        if (x >= b) {
            if (y >= a || y >= c) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        if (y >= b) {
            if (y >= a || y >= c) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        if (x >= c) {
            if (y >= a || y >= b) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        if (y >= c) {
            if (y >= a || y >= b) {
                System.out.println("Кирпич пройдет");
                return;
            }
        }
        System.out.println("Кирпич не пройдет!");
    }
}


