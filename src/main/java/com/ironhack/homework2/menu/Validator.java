package com.ironhack.homework2.menu;

import org.apache.commons.validator.routines.EmailValidator;

public class Validator {

    public static boolean isPhoneNumberValid(String phoneNumber){
        if (phoneNumber.length() > 1 && phoneNumber.length() < 16 && phoneNumber.matches("[0-9()+-]+")) {
            return true;
        } else {
            throw new IllegalArgumentException("The phone number must have a maximum of 16 digits including prefix.");
        }
    }

    public static boolean isEmailValid(String email){
        boolean result = false;
        if(EmailValidator.getInstance().isValid(email)){
            result = true;
        } else {
            throw new IllegalArgumentException("The email address format is not valid.");
        }
        return result;
    }

    public static boolean isStringValid(String string) {
        if(string.length() > 1 && string.length() < 35 && string.replaceAll("\\s+","").matches("[áéíóúàèìòùäëïöüãẽõçłña-zÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÃẼÕÇŁÑA-Z0-9]+")){
            return true;
        } else {
            throw new IllegalArgumentException("Not a valid input.");
        }
    }

}
