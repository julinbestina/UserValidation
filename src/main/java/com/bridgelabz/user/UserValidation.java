package com.bridgelabz.user;


import com.bridgelabz.exception.ExceptionType;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class UserValidation {

    Predicate<String> validateFirstName = (firstName) -> {
        boolean result = firstName.matches("^[A-Z]{1}[a-z]{2,}$");
        if (!result) {
            throw new UserValidationException("Invalid FirstName", ExceptionType.INVALID_FIRSTNAME);
        }
        return result;
    };

    Predicate<String> validateLastName = (lastName) -> {
        boolean result = lastName.matches("^[A-Z]{1}[a-z]{2,}$");
        if (!result) {
            throw new UserValidationException("Invalid LastName", ExceptionType.INVALID_LASTNAME);
        }
        return result;
    };

    Predicate<String> validateEmail = (email) -> {
        boolean result = email.matches("^[a-z]+([+-.]?[a-z0-9])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$");
        if (!result) {
            throw new UserValidationException("Invalid Email ID", ExceptionType.INVALID_EMAIL);
        }
        return true;
    };

    Predicate<String> validateMobile = (mobile) -> {
        boolean result = mobile.matches("^(91)[\\s][0-9]{10}$");
        if (!result) {
            throw new UserValidationException("Invalid Mobile Format", ExceptionType.INVALID_MOBILE_NUMBER);
        }
        return true;
    };

    Predicate<String> validatePassword = (password) -> {
        boolean result = matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}", password);
        if (!result) {
            throw new UserValidationException("Invalid Password", ExceptionType.INVALID_PASSWORD);
        }
        return true;
    };
}
