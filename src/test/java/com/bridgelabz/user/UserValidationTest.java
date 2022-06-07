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
        boolean isValid = user.validateEmail("abc111@abc.com");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        boolean isValid = user.validateMobile("91 9645212823");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean isValid = user.validatePassword("Bestina@5");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenInValid_ShouldReturnFalse() {

            boolean isValid = user.validateFirstName("JuLin");

        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnFalse() {
            boolean isValid = user.validateLastName("bestinA");
            Assert.assertFalse(isValid);
    }
    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse() {
        boolean isValid = user.validateEmail("abc()*@gmail.com");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobile_WhenImProper_ShouldReturnFalse() {
        boolean isValid = user.validateMobile("91968645231");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenInValid_ShouldReturnFalse() {
        boolean isValid = user.validatePassword("shadow6");
        Assert.assertFalse(isValid);
    }
}
