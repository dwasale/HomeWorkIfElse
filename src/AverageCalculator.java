import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        // Creating scanner object to get user value
        Scanner scanner = new Scanner(System.in);

        // initialising integer value
        int x = 0;
        System.out.println("Enter 5 numbers");
        // Getting only 5 values from the user
        for (int y = 0; y < 5; y++){
            int number = scanner.nextInt();
            // getting total value from user input
            x += number;
        }
        System.out.println("Average is " + x/5);
    }
}
