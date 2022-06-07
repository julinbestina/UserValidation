package com.bridgelabz.user;

import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
    }

}

