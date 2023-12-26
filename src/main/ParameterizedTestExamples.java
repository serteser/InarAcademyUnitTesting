package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestExamples {

    public enum TrafficLight {
        RED("Please stop"), GREEN("Please go"),
        YELLOW("Please caution");

        private String description;

        private TrafficLight(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }


    public enum MyFavoriteBooks {MOBYDICK, SHOGUN, ATONEMENT, CIRCE}

    ;
    static MyFavoriteBooks book1 = MyFavoriteBooks.CIRCE;
    MyFavoriteBooks book2 = MyFavoriteBooks.MOBYDICK;
    MyFavoriteBooks book3 = MyFavoriteBooks.SHOGUN;
    MyFavoriteBooks book4 = MyFavoriteBooks.ATONEMENT;

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.0, 3.0, 5.0, -3.0})
    void testWithDifferentValues(double input) {
        // Arrange
        TrainingClass trainingClass = new TrainingClass();
        // Act
        double result = trainingClass.add(input, input);
        System.out.println(result);
        // Assert
        assertTrue(result > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, -3})
    void testWithDifferentValues(int input) {
        // Arrange
        TrainingClass trainingClass = new TrainingClass();
        // Act
        boolean result = trainingClass.isEven(input);

        // Assert
        assertTrue(result, "Because of \"" + input + "\" is not even the test has failed.");
    }




}
