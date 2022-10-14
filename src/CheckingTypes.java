import java.util.Scanner;

public class CheckingTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any value: ");
        char value = scanner.next().charAt(0);

        if ((value >= 65 && value <= 90)    // Checking for alphabets
                || (value >= 97 && value <= 122))
            System.out.println("Alphabet ");

            // Checking for numbers
        else if (value >= 48 && value <= 57)
            System.out.println("Number ");

            // otherwise symbols
        else
            System.out.println("Symbol ");
    }
}
