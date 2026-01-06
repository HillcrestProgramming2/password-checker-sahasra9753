package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    public static String generateFeedback(String password) {
        if (password.length() < 8) {
            return "Increase to at least 8 characters.";
        }
    }
}
