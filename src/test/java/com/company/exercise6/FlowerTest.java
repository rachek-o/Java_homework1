package com.company.exercise6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    @Test
    void trueTest() {
        Flower f1 = new Flower();
        assertTrue(f1.bloom());
    }
    @Test
    void falseTest() {
        Flower f2 = new Flower();
        assertFalse(f2.smell());
    }
}