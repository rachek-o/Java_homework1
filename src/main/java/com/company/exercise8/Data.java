package com.company.exercise8;
import java.util.ArrayList;
import java.util.Collections;
public class Data {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        arr.add(new SalariedEmployee("Oleg", "14", 2000.00));
        arr.add(new ContractEmployee("Andriy", "16", 42, 8));
        arr.add(new SalariedEmployee("Halyna", "25", 3000.00));
        arr.add(new ContractEmployee("Olga", "44", 44, 12));

        System.out.println("List of employee:");

        Collections.sort(arr);
        Collections.reverse(arr);
        for(Employee str: arr){
            System.out.println(str);
        }
    }
}







