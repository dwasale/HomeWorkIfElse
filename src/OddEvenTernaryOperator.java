import java.util.Scanner;

public class OddEvenTernaryOperator {

    public static void main(String[] args) {
        // Scanner class to get value from user/console
        // Creating scanner object to access user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();  // Scan user input and store an integer value

        // Ternary operator in use
        // If condition in (......) is true it prints first sentence in "...." and if false prints the one after
        String  oddEven = (x % 2 == 0)? "It's an even number" : "It's an odd number";
        System.out.println(oddEven);
    }

}
