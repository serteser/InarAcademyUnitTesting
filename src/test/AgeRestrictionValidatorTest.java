package test;

import main.AgeRestrictionValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeRestrictionValidatorTest {

    AgeRestrictionValidator age;

    @BeforeAll
    static void testStart() {
        System.out.println("Test has started.");
    }

    @AfterAll
    static void testFinish() {
        System.out.println("Test has finished.");
    }

    @BeforeEach
    void initializeObj() {
        age = new AgeRestrictionValidator();
    }

    @AfterEach
    void devastateObj() {
        age = null;
    }

    @Test
    void TC_002_01_InvalidTest() {
        boolean result = age.isEligible(17);
        assertFalse(result, "TC_002_01_InvalidTest input data: Age Just Below Minimum (17)");
    }

    @Test
    void TC_002_02_ValidTest() {
        boolean result = age.isEligible(18);
        assertTrue(result, "TC_002_02_InvalidTest input data: Age At Minimum Boundary (18)");
    }
    @Test
    void TC_002_03_ValidTest() {
        boolean result = age.isEligible(19);
        assertTrue(result, "TC_002_03_InvalidTest input data: Age Just Above Minimum (19)");
    }
    @Test
    void TC_002_04_ValidTest() {
        boolean result = age.isEligible(64);
        assertTrue(result, "TC_002_04_InvalidTest input data: Age Just Below Maximum (64)");
    }
    @Test
    void TC_002_05_ValidTest() {
        boolean result = age.isEligible(65);
        assertTrue(result, "TC_002_05_InvalidTest input data: Age At Maximum Boundary (65)");
    }
    @Test
    void TC_002_06_InvalidTest() {
        boolean result = age.isEligible(66);
        assertFalse(result, "TC_002_06_InvalidTest input data: Age Just Above Maximum (66)");
    }
    @Test
    void TC_002_07_InvalidTest() {
        boolean result = age.isEligible(0);
        assertFalse(result, "TC_002_07_InvalidTest input data: Extreme Low Age (0)");
    }
    @Test
    void TC_002_08_InvalidTest() {
        boolean result = age.isEligible(100);
        assertFalse(result, "TC_002_08_InvalidTest input data: Extreme High Age (100)");
    }

}
