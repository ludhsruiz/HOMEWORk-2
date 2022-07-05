package com.ironhack.homework2.menu;


import com.ironhack.homework2.enums.Command;
import com.ironhack.homework2.enums.ObjectType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    static Input input;

    @BeforeAll
    static void setUp() {
        input = new Input(new Output());
    }

    @Test
    void getCommandFromString() {
        assertEquals(Command.SHOW, input.getCommandFromString("SHOW"));
        assertEquals(Command.SHOW, input.getCommandFromString("show"));
        assertNull(input.getCommandFromString("abc"));
    }

    @Test
    void getObjectTypeFromStringSingular() {
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringSingular("ACCOUNT"));
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringSingular("account"));
        assertNull(input.getObjectTypeFromStringSingular("abc"));
    }

    @Test
    void getObjectTypeFromStringPlural() {
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringPlural("ACCOUNTS"));
        assertEquals(ObjectType.ACCOUNT, input.getObjectTypeFromStringPlural("accounts"));
        assertNull(input.getObjectTypeFromStringPlural("abc"));
    }

}