package com.bridgelabz.user;

import com.bridgelabz.exception.ExceptionType;

public class UserValidationException extends RuntimeException{
    public ExceptionType type;
    public UserValidationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
