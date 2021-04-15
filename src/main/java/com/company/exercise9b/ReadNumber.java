package com.company.exercise9b;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) throws Exception {

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            int number = readNumber(1, 100);
            array[i] = number;
            if (i> 0 && array[i] < array[i - 1]) {
                throw new Exception("Every new number should be larger than the previous one");
            }
        }
    }
    public static int readNumber(int start, int end) throws Exception {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = in.nextInt();
            if (number < end && number > start)
                return number;
            throw new Exception("Out of the range");
        }
    }
