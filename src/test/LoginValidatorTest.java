package test;

import main.LoginValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginValidatorTest {

    LoginValidator loginValidator;


    @BeforeAll
    static void testStart() {

        System.out.println("Test has started.");
    }

    @AfterAll
    static void testFinish() {

        System.out.println("Test has finished.");
    }

    @BeforeEach
    void initiateObj() {

        loginValidator = new LoginValidator();

    }

    @AfterEach
    void devastateObj() {

        loginValidator = null;
    }

    // Username Tests
    @Test
    public void TC_001_01_UsernameValid() {

        boolean result = loginValidator.validateUsername("abc@abc.com");

        assertTrue(result, "TC_001_01 Valid input data: abc@abc.com");
    }

    @Test
    public void TC_001_02_UsernameInvalid() {

        boolean result = loginValidator.validateUsername("abcabc.com");

        assertFalse(result, "TC_001_02 Invalid input data Email Without @ Symbol: abcabc.com");
    }

    @Test
    public void TC_001_03_UsernameInvalid() {

        boolean result = loginValidator.validateUsername("abc@.com");

        assertFalse(result, "TC_001_03 Invalid input data Email Without Domain: abc@.com");
    }

    @Test
    public void TC_001_04_UsernameInvalid() {

        boolean result = loginValidator.validateUsername("abc@abc..com");

        assertFalse(result, "TC_001_04 Invalid input data Email With Invalid Characters: abc@abc..com");
    }

    @Test
    public void TC_001_05_UsernameInvalid() {

        boolean result = loginValidator.validateUsername(" ");

        assertFalse(result, "TC_001_05 Invalid input data With Empty Email String:");
    }

    @Test
    public void TC_001_06_UsernameInvalid() {

        boolean result = loginValidator.validateUsername("");

        assertFalse(result, "TC_001_06 Invalid input data With Null Email Address:");
    }

    // Password Tests
    @Test
    public void TC_001_07_PasswordValid() {

        boolean result = loginValidator.validatePassword("abcabcabcabc!1");

        assertTrue(result, "TC_001_07 Valid input data: abcabcabcabc!1");
    }

    @Test
    public void TC_001_08_PasswordInvalid() {

        boolean result = loginValidator.validatePassword("abcabcabcabc1");

        assertFalse(result, "TC_001_08 Invalid input data Password Without Special Character: abcabcabcabc1");
    }

    @Test
    public void TC_001_09_PasswordInvalid() {

        boolean result = loginValidator.validatePassword("abcabcabcabc!");

        assertFalse(result, "TC_001_09 Invalid input data Password Without Number: abcabcabcabc!");
    }

    @Test
    public void TC_001_10_PasswordInvalid() {

        boolean result = loginValidator.validatePassword("bcabc!1");

        assertFalse(result, "TC_001_10 Invalid input data  Password Too Short (Less than 8 Characters): bcabc!1");
    }

    @Test
    public void TC_001_11_PasswordInvalid() {

        boolean result = loginValidator.validatePassword("abcabcabcabcabc!1");

        assertFalse(result, "TC_001_11 Invalid input data Password Too Long (More than 16 Characters): abcabcabcabcabc!1");
    }

    @Test
    public void TC_001_12_PasswordInvalid() {

        boolean result = loginValidator.validatePassword(" ");

        assertFalse(result, "TC_001_12 Invalid input data With Empty Password String:");
    }

    @Test
    public void TC_001_13_PasswordInvalid() {

        boolean result = loginValidator.validatePassword("");

        assertFalse(result, "TC_001_13 Invalid input data With Null Password:");
    }
}
