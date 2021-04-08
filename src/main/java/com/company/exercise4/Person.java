package com.company.exercise4;
import java.util.Scanner;


public class Person {
    static Person input() {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Name: ");
        person.setName(in.next());
        System.out.print("Year of birth: ");
        person.setBirthYear(in.nextInt());
        return person;
    }

    public String output() {
        return "Name: " + name + "BirthYear: " + birthYear + ", Age: " + getAge();
    }


    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String Name, int birthYear) {
        this.name = Name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2021 - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    void changeName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person[] individuals = new Person[5];

        individuals[0] = new Person();
        individuals[1] = new Person();
        individuals[2] = new Person();
        individuals[3] = new Person();
        individuals[4] = new Person();

        for (int i = 0; i < 5; i++) {
            individuals[i] = Person.input();
        }

        for (Person person : individuals) {
            System.out.println(person.output());
        }
    }
}


