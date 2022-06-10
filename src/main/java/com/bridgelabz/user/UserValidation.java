package com.bridgelabz.user;



import com.bridgelabz.exception.ExceptionType;

import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String firstName) {
        boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
        if(!result){
            throw new UserValidationException("Invalid FirstName", ExceptionType.INVALID_FIRSTNAME);
        }
        return true;
    }

    public boolean validateLastName(String lastName) {
        boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
        if(!result) {
            throw new UserValidationException("Invalid LastName", ExceptionType.INVALID_LASTNAME);
        }
        return true;
    }

    public boolean validateEmail(String email) {
        boolean result = Pattern.matches("^[a-z]+([+-.]?[a-z0-9])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", email);
        if(!result) {
            throw new UserValidationException("Invalid Email ID", ExceptionType.INVALID_EMAIL);
        }
        return true;
    }

    public boolean validateMobile(String mobile) {
        boolean result = Pattern.matches("^(91)[\\s][0-9]{10}$", mobile);
    if(!result) {
        throw new UserValidationException("Invalid Mobile Format", ExceptionType.INVALID_MOBILE_NUMBER);
    }
    return true;
    }

    public boolean validatePassword(String password) {
        boolean result = Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}", password);
        if(!result) {
            throw new UserValidationException("Invalid Password", ExceptionType.INVALID_PASSWORD);
        }
        return true;
    }
}
