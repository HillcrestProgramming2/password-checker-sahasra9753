package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    public static String generateFeedback(String password) {
        if (password.length() < 8) {
            return "Increase to at least 8 characters.";
        } else if (!hasUpper) {
            return "Add at least one uppercase letter";
        } else if (!hasLower) {
            return "Add at least one lowercase letter.";
        } else if (!hasDigit) {
            return "Add at least one number.";
        } else if (!hasSpecial) {
            return "Include a special charecter.";
        } 
        return feedback.toString();
}
}        
