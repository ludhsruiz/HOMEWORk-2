package com.ironhack.homework2.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void isNumeric() {
        assertTrue(Item.isNumeric("22 22 22 222 2 2 "));
        assertTrue(Item.isNumeric("123456789"));
        assertTrue(Item.isNumeric("+45 123 456"));

        assertFalse(Item.isNumeric("abc def ghi"));
        assertFalse(Item.isNumeric(" "));
        assertFalse(Item.isNumeric(null));

    }
}