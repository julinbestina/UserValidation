package com.bridgelabz.user;

import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches("^[a-z]+([+-.]?[a-z0-9])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", email);
    }

    public boolean validateMobile(String mobile) {
        return Pattern.matches("^(91)[\\s][0-9]{10}$", mobile);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches("[a-zA-Z0-9@#$%^&-+=()]{8,}", password);
    }
}
