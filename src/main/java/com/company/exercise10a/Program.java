package com.company.exercise10a;
import java.util.*;

public class Program {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Korych", "Anton");
        personMap.put("Goroh", "Nadya");
        personMap.put("Kid", "Yulya");
        personMap.put("Kut", "Orest");
        personMap.put("Scherban", "Yulya");
        personMap.put("Savchenko", "Olga");
        personMap.put("Korol", "Oleh");
        personMap.put("Son", "Anastasiya");
        personMap.put("Kit", "Taras");
        personMap.put("Kolo", "Olena");

        System.out.println("HashMap elements:" + personMap);

        String remove = null;
        for (Map.Entry<String, String> stringStringEntry : personMap.entrySet()) {
            String key1 = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            if (value.equals("Orest"))
                remove = key1;
        }
        personMap.remove(remove);
        System.out.print("Without Orest" + personMap);
    }

    }











