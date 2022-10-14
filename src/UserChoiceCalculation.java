import java.util.Scanner;

public class UserChoiceCalculation {

    public static void main(String[] args) {
        // Creating object for scanner to get user input and choice
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("""
                Choose:\s
                1: Addition(+)\s
                2: Subtraction(-)
                3: Multiplication(*)
                4: Division(/)""");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        // Calling case 1 .... so on according to choice we make
        switch (choice) {
            case 1 -> System.out.println("Addition: " + (number1 + number2));
            case 2 -> System.out.println("Subtraction: " + (number1 - number2));
            case 3 -> System.out.println("Multiplication: " + (number1 * number2));
            case 4 -> System.out.println("Division: " + (number1 / number2));
        }
    }
}
