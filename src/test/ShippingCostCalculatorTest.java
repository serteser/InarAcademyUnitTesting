package test;

import main.ShippingCostCalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {

    ShippingCostCalculator cost;

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

        cost = new ShippingCostCalculator();
    }

    @AfterEach
    void devastateObj() {

        cost = null;
    }

    @Test
    void TC_003_01_LocalDestinationWithStandardDelivery() {

        double actual = cost.calculateCost(10, "Local", "Standard");

        assertEquals(10, actual, "TC_003_01_LocalDestinationWithStandardDelivery for weight:10 the cost should be 10");
    }

    @Test
    void TC_003_02_LocalDestinationWithExpressDelivery() {

        double actual = cost.calculateCost(10, "Local", "Express");

        assertEquals(25, actual, "TC_003_02_LocalDestinationWithExpressDelivery for weight:10 the cost should be 25");
    }

    @Test
    void TC_003_03_InternationalDestinationWithStandardDelivery() {

        double actual = cost.calculateCost(10, "International", "Standard");

        assertEquals(50, actual, "TC_003_03_InternationalDestinationWithStandardDelivery for weight:10 the cost should be 50");
    }

    @Test
    void TC_003_04_InternationalDestinationWithExpressDelivery() {

        double actual = cost.calculateCost(10, "International", "Express");

        assertEquals(125, actual, "TC_003_04_InternationalDestinationWithExpressDelivery for weight:10 the cost should be 125");
    }

    @Test
    void TC_003_05_ZeroWeightWithLocalStandardDelivery() {

        double actual = cost.calculateCost(0, "Local", "Standard");

        assertEquals(0, actual, "TC_003_05_ZeroWeightWithLocalStandardDelivery for weight:0 the cost should be 0");
    }

    @Test
    void TC_003_06_ZeroWeightWithLocalExpressDelivery() {

        double actual = cost.calculateCost(0, "Local", "Express");

        assertEquals(0, actual, "TC_003_05_ZeroWeightWithLocalExpressDelivery for weight:0 the cost should be 0");
    }

    @Test
    void TC_003_07_ZeroWeightWithInternationalStandardDelivery() {

        double actual = cost.calculateCost(0, "International", "Standard");

        assertEquals(0, actual, "TC_003_07_ZeroWeightWithInternationalStandardDelivery for weight:0 the cost should be 0");
    }

    @Test
    void TC_003_08_ZeroWeightWithInternationalExpressDelivery() {

        double actual = cost.calculateCost(0, "International", "Express");

        assertEquals(0, actual, "TC_003_07_ZeroWeightWithInternationalExpressDelivery for weight:0 the cost should be 0");
    }

    @Test
    void TC_003_09_NegativeWeightWithLocalStandardDelivery() {

        double actual = cost.calculateCost(-2, "Local", "Standard");

        assertEquals("\"The invalid weight value.\"", actual, "TC_003_09_NegativeWeightWithLocalStandardDelivery for weight: -2 " +

                "\"The invalid weight value.\" should be displayed.");
    }

    @Test
    void TC_003_10_NegativeWeightWithLocalExpressDelivery() {

        double actual = cost.calculateCost(-2, "Local", "Express");

        assertEquals("\"The invalid weight value.\"", actual, "TC_003_10_NegativeWeightWithLocalExpressDelivery for weight: -2 " +

                "\"The invalid weight value.\" should be displayed.");
    }

    @Test
    void TC_003_11_NegativeWeightWithInternationalStandardDelivery() {

        double actual = cost.calculateCost(-2, "International", "Standard");

        assertEquals("\"The invalid weight value.\"", actual, "TC_003_11_NegativeWeightWithInternationalStandardDelivery for weight: -2 " +

                "\"The invalid weight value.\" should be displayed.");
    }

    @Test
    void TC_003_12_NegativeWeightWithInternationalExpressDelivery() {

        double actual = cost.calculateCost(-2, "International", "Express");

        assertEquals("\"The invalid weight value.\"", actual, "TC_003_12_NegativeWeightWithInternationalExpressDelivery for weight: -2 " +

                "\"The invalid weight value.\" should be displayed.");
    }
}
