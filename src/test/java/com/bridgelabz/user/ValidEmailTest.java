package com.bridgelabz.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String mailToTest;
    private boolean expectedResult;

    public ValidEmailTest(String mailToTest, boolean expectedResult) {
        this.mailToTest = mailToTest;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection Data(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {" .abc@abc.com", false},
                {" abc()*@gmail.com ", false},
                {" abc@%*.com", false},
                {" abc..2002@gmail.com", false},
                {" abc.@gmail.com", false},
                {" abc@abc@gmail.com", false},
                {" abc@gmail.com.1a", false},
                {" abc@gmail.com.aa.au", false},
                {" abc@.com.my", false}});
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidation user = new UserValidation();
        boolean email = user.validateEmail.test(this.mailToTest);
        Assert.assertEquals(this.expectedResult, email);
    }
}
