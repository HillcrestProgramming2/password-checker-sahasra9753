package org.hillcrest.chapter6.password;

public class CriteriaChecker {

    //utility class
    public static int evaluateCriteria(String password) {

        boolean lengthMet = false;
        boolean hasAlpha = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean specialCharacters = false;

        int score = 0;
        String special = "!@#$%^&*()-+=";

        if (password.length() >= 8) {
            lengthMet = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isAlphabetic(character)) {
                hasAlpha = true;
                score++;
            } else if (Character.isUpperCase(character)) {
                hasUpperCase = true;
                score++;
            } else if (Character.isLowerCase(character)) {
                hasLowerCase = true;
                score++;
            } else if (Character.isDigit(character)) {
                hasDigit = true;
                score++;
            } else if (special.contains(String.valueOf(character))) {
                specialCharacters = true;
                score++;
            }

        }
            return score;
    }
    public static String determineStrength(int score) {
        if (score >= 0 && score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else if (score >= 4 && score <= 5) {
            return "Strong";
        }
            return ;
    }
}
