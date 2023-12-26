package test;

import main.LimitedAge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LimitedAgeTest {

    @Test
    void TC_001_01_Input() {

        LimitedAge age = new LimitedAge();

        boolean result = age.isLimitedAge(18);

        assertTrue(result, "18 should be true");
    }
}
