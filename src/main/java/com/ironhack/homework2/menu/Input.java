package com.ironhack.homework2.menu;

import com.ironhack.homework2.enums.*;
import java.util.Scanner;


public class Input {

    private Scanner scanner = new Scanner(System.in);
    private Output printer;

    public Input(Output printer) {
        this.printer = printer;
    }

    public String getString() {
        printer.print(">");
        return scanner.nextLine();
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public int getIntegerHigherThanZero() {
        int intValue = -1;
        do {
            String input = scanner.next();
            try {
                intValue = Integer.parseInt(input);
            } catch (NumberFormatException exp) {
                System.out.println("Must be Integer higher than 0)");
            }
        } while (intValue <= 0);

        scanner.nextLine();
        return intValue;
    }

    public void close() {
        scanner.close();
    }

    // method to convert case insensitive string to Command Enum
    public Command getCommandFromString(String string) {
        string = string.toUpperCase();
        for (Command command : Command.values()) {
            if (string.equals(command.getExpectedInput())) {
                return command;
            }
        }
        return null;
    }

    // method to convert case insensitive string (in singular form) to ObjectTypes Enum
    public ObjectType getObjectTypeFromStringSingular(String string) {
        string = string.toUpperCase();
        for (ObjectType objectType : ObjectType.values()) {
            if (string.equals(objectType.getSingularForm())) {
                return objectType;
            }
        }
        return null;
    }

    // method to convert case insensitive string (in plural form) to ObjectTypes Enum
    public ObjectType getObjectTypeFromStringPlural(String string) {
        string = string.toUpperCase();
        for (ObjectType objectType : ObjectType.values()) {
            if (string.equals(objectType.getPluralForm())) {
                return objectType;
            }
        }
        return null;
    }

    public Industry chooseIndustry() {
        System.out.println("\nType of Industry:" +
                "\n1 - Produce" +
                "\n2 - E-Commerce" +
                "\n3 - Manufacturing" +
                "\n4 - Medical" +
                "\n5 - Other");
        int input;
        do {
            input = getIntegerHigherThanZero();
        } while (input > 5);
        switch (input) {
            case 1:
                return Industry.PRODUCE;
            case 2:
                return Industry.ECOMMERCE;
            case 3:
                return Industry.MANUFACTURING;
            case 4:
                return Industry.MEDICAL;
            default:
                return Industry.OTHER;
        }
    }

    public Product chooseProduct() {
        System.out.println("\nType of Product:\n" +
                "1 - HYBRID\n" +
                "2 - FLATBED\n" +
                "3 - BOX");
        int input;
        do {
            input = getIntegerHigherThanZero();
        } while (input > 3);
        switch (input) {
            case 1:
                return Product.HYBRID;
            case 2:
                return Product.FLATBED;
            default:
                return Product.BOX;
        }
    }
}

