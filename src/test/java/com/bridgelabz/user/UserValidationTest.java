package com.bridgelabz.user;


import com.bridgelabz.exception.ExceptionType;
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
        try {
            boolean isValid = user.validateFirstName("JuLin");
        } catch (UserValidationException ex) {
            Assert.assertEquals(ExceptionType.INVALID_FIRSTNAME,ex.type);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnFalse() {
        try {
            boolean isValid = user.validateLastName("bestinA");
        } catch(UserValidationException ex) {
            Assert.assertEquals(ExceptionType.INVALID_LASTNAME, ex.type);
        }
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse() {
        try {
            boolean isValid = user.validateEmail("abc()*@gmail.com");
        } catch (UserValidationException ex) {
            Assert.assertEquals(ExceptionType.INVALID_EMAIL, ex.type);
        }
    }

    @Test
    public void givenMobile_WhenImProper_ShouldReturnFalse() {
        try {
            boolean isValid = user.validateMobile("91968645231");
        } catch(UserValidationException ex) {
            Assert.assertEquals(ExceptionType.INVALID_MOBILE_NUMBER, ex.type);
        }
    }

    @Test
    public void givenPassword_WhenInValid_ShouldReturnFalse() {
        try {
            boolean isValid = user.validatePassword("shadow6");
        } catch(UserValidationException ex) {
            Assert.assertEquals(ExceptionType.INVALID_PASSWORD, ex.type);
        }
    }
}
