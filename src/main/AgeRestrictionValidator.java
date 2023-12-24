//        Class:        AgeRestrictionValidator
//        Description:  Validates if a user is eligible for age-restricted content, considering legal age is
//                      between 18-65.
//        Methods:
//                      boolean isEligible(int age): Determines if the age falls within the legal age range.
package main;
public class AgeRestrictionValidator {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;
    /**
     * Validates if the user's age is within the legal range for
     age-restricted content.
     *
     * @param age the age of the user
     * @return true if the age is within the legal range, false otherwise
     */
    public boolean isEligible(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }

}
