package com.ironhack.homework2.menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    Menu menu = new Menu();

    @Test
    void splitInput() {
        String[] inputArray = menu.splitInput("lookup lead 345 ");
        String[] expectedInputArray = {"lookup", "lead", "345"};
        assertEquals(expectedInputArray[0], inputArray[0]);
        assertEquals(expectedInputArray[1], inputArray[1]);
        assertEquals(expectedInputArray[2], inputArray[2]);
    }
}