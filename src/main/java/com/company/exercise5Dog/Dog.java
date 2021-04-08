package com.company.exercise5Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dog implements Comparable<Dog> {

    private final String name;
    private final int age;
    private final BreedDog breed;

    Dog(String name, int age, BreedDog breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik", 2, BreedDog.BEAGLE);
        Dog d2 = new Dog("Tuzik", 5, BreedDog.BEABULL);
        Dog d3 = new Dog("Rex", 10, BreedDog.POODLE);

        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);

        Collections.sort(dogList);

        System.out.println("The oldest dog is " + dogList.get(0).getName() + " " + dogList.get(0).getBreed());
        System.out.println(d1.equals(d2));

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Dog other = (Dog) obj;
        if (name != other.name) return false;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' + "breed='" + breed +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BreedDog getBreed() {
        return breed;
    }

    @Override
    public int compareTo(Dog p) {
        return p.getAge() - this.getAge();
    }

    public enum BreedDog {
        BEAGLE,
        BEABULL,
        POODLE
    }
}
