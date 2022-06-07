package com.bridgelabz.user;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidation user = new UserValidation();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean isValid = user.validateFirstName("Julin");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTure() {
        boolean isValid = user.validateLastName("Bestina");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean isValid = user.validateEmail("abc.100@abc.com.au");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        boolean isValid = user.validateMobile("91 9645285623");
        Assert.assertTrue(isValid);
    }

}
