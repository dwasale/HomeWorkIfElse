import java.util.InputMismatchException;
import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args) {
        // Scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        while (true){       // Validation statement and exception handling
            System.out.print("Enter year: ");
            try {       // It executes the code in this block first and goes to catch block if only it throws exception
                int year = scanner.nextInt();
                leapYearCalculator(year);   // Calculation leap year or not by calling the method
                break;
            } catch (InputMismatchException e){     // Catch the error if it is not integer/numeric
                System.out.println("Invalid Year");
                scanner.next(); // Scan the next input
            }
        }
    }

    // Method for calculating leap year
    public static void leapYearCalculator(int year){
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {      // If year is divisible by 4 and 400 but not by 100
            System.out.println(year + ": Is Leap Year");
        } else {
            System.out.println(year + ": Non-Leap Year");
        }
    }
}
