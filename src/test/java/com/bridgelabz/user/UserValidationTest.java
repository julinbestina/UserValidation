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

}
