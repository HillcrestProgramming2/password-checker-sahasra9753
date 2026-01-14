package org.hillcrest.chapter6.password;
import java.util.Scanner;
public class PasswordCheckerApp {
    //main method goes here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        
        System.out.println("Password Strength: " + strength + " (" + score + "/5)");

        if (!feedback.isEmpty()) {
            System.out.println("Suggestions to improve your password:");
            System.out.print(feedback);
        }

        scanner.close();
    }
}

   

    }
}
    
