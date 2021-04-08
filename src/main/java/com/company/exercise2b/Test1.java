package com.company.exercise2b;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse;
        while( n > 0){
            reverse = n % 10;
            n  /=  10;
            System.out.print(reverse);

        }
    }
}
