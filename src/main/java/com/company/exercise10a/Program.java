package com.company.exercise10a;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

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

            String remove = null;
            for (Map.Entry<String, String> stringStringEntry : personMap.entrySet()) {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                if (value.equals("Orest"))
                    remove = key;
            }
            personMap.remove(remove);
            System.out.print("Without Orest" + personMap);
        }

    }











