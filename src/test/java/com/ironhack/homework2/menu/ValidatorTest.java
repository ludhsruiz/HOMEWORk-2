package com.ironhack.homework2.menu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isPhoneNumberValidTest() {
        assertTrue(Validator.isPhoneNumberValid("123-456-789"));
        assertTrue(Validator.isPhoneNumberValid("666999555"));
        assertTrue(Validator.isPhoneNumberValid("(+598)666999555"));

        assertThrows(IllegalArgumentException.class, () -> Validator.isPhoneNumberValid("46464860378912333"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isPhoneNumberValid("abc"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isPhoneNumberValid(""));
    }

    @Test
    void isEmailValidTest() {
        assertTrue(Validator.isEmailValid("abcdhhd@defhd.com"));
        assertTrue(Validator.isEmailValid("shdog@kj.de"));
        assertTrue(Validator.isEmailValid("koziolek@matolek.pl"));

        assertThrows(IllegalArgumentException.class, () -> Validator.isEmailValid("kjhajhfgi.iaugh"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isEmailValid("hdhdhdh@uhgab"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isEmailValid("abcfgdhah"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isEmailValid("abcfg@dhah.sgs"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isEmailValid(""));

    }

    @Test
    void isStringValidTest() {
        assertTrue(Validator.isStringValid("abcdhhddefhdcom 2"));
        assertTrue(Validator.isStringValid("shdogködá"));
        assertTrue(Validator.isStringValid("qwerñyuiopasdfghjklzxcvbnmqwertyui"));
        assertTrue(Validator.isStringValid("aa"));

        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid("kjhajhfgi.iaugh"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid("hdhdhdh@uhgab"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid(""));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid("a"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid("."));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid("!@#$%^&*()"));
        assertThrows(IllegalArgumentException.class, () -> Validator.isStringValid(" "));

    }
}
