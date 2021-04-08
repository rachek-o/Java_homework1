package com.company.exercise5Dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void equalsTest() {
        Dog dog1 = new Dog("dog1", 10, Dog.BreedDog.BEABULL);
        Dog dog2 = new Dog("dog2", 10, Dog.BreedDog.BEABULL);
        Dog dog3 = new Dog("dog1", 10, Dog.BreedDog.BEABULL);

        assertEquals(dog1, dog3);
        assertNotEquals(dog1, dog2);
    }
}