package com.company.exercise11;

public class Class {
    public static void main(String[] args) {

        Student.addStudent(new Student("Oleg", 1));
        Student.addStudent(new Student("Andriy", 2));
        Student.addStudent(new Student("Igor", 4));
        Student.addStudent(new Student("Svyatoslav", 5));
        Student.addStudent(new Student("Olga", 3));
        Student.addStudent(new Student("Ira", 4));
        Student.addStudent(new Student("Olesya", 5));
        Student.addStudent(new Student("Inna", 1));
        Student.addStudent(new Student("Yulya", 2));

        System.out.println("COURSE 2: ");
        Student.printStudent(2);

        System.out.println("COURSE 5: ");
        Student.printStudent(5);

    }
    }
