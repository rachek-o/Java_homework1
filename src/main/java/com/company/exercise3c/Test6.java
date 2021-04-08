package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c1 = Integer.parseInt(br.readLine());
        int t1 = Integer.parseInt(br.readLine());
        {
            System.out.println(c1 * t1);
        }
        int c2 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        {
            System.out.println(c2 * t2);
        }
        int c3 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());
        {
            System.out.println(c3 * t3);
        }
        {
            System.out.println(c1 * t1 + c2 * t2 + c3 * t3);
        }
    }
}


