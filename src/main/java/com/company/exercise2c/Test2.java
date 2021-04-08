package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (n / count >= 10)
            count *= 10;

        int first = n / count;
        int last = n % 10;
        int reverse = n + (count - 1) * (last - first);
        System.out.print(reverse);

    }
}




