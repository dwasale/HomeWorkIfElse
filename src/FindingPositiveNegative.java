import java.util.Scanner;

public class FindingPositiveNegative {

    public static void main(String[] args) {
        // Creating scanner objet to get user value
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking positive, negative or zero
        positiveNegative(number);

    }

    // Method to check weather given number is positive, negative or zero
    public static void positiveNegative(int number){
        if (number > 0){    // If number is greater than 0 it prints positive
            System.out.println(number + " is positive number");
        } else if (number < 0){      // If number is less the 0 it prints negative
            System.out.println(number + " is negative number");
        } else {        // It prints is 0 if above condition do not match
            System.out.println(number + " is Zero");
        }
    }
}
