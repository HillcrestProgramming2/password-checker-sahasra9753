package org.hillcrest.chapter6.password;

public class PasswordCheckerApp {
    //main method goes here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
    //prompt user for password
    System.out.print("Enter a password: ");
    String password = scanner.nextLine();

    int score = CriteriaChecker.evaluateCriteria(password);
    String strength = CriteriaChecker.determineStrength(score);


    System.out.println("Password Strength: " + strength + " (" + score + "/5");
    //Check strength
        
    //Provide user feedback based on the strength
    if (!feedback.isEmpty()) {
        System.out.println("Suggestions to improve your password:");
        System.out.print(feedback);
        }

    scanner.close();
    }
}
    
