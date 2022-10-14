import java.util.Scanner;   // Java predefined Scanner class from java.util package

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();    // Store the value input from user
        registration(age);  // Calling the method to check eligibility
    }
    public static void registration(int age){
        if (age < 100) {    // Checking the condition
            if (age >= 18) {    // If the above condition is true it checks this condition again
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible");
            }
        } else {    // If first condition is false it will print the statement below
            System.out.println("Your are too old to vote");
        }
    }
}
