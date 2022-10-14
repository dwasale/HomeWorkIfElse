import java.util.Scanner;

public class InterchangeValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter value for x: ");
        int x = scanner.nextInt(); // Getting first integer value from user

        System.out.print("Enter value for y: ");
        int y = scanner.nextInt(); // Getting second integer value from user

        swappingValue(x , y); // Calling the method to swap the value/reversing

    }

    public static void swappingValue(int x, int y){
        int temp = x;  // Creating temporary variable for swapping the values
        x = y;      // Swapping the values
        y = temp;

        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);
    }
}
