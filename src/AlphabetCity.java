import java.util.Scanner; // Java predefined Scanner class from java.util package

public class AlphabetCity {

    Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {
        AlphabetCity obj = new AlphabetCity();

        char alphabet;
        System.out.print("Enter the alphabet(A-F): ");
        alphabet = obj.scanner.next().toLowerCase().charAt(0); // If the user input is in Uppercase it will change to lower case

        while (alphabet < 'a' || alphabet > 'f') {  //Checking the range of the character input
            System.out.println("Invalid range");
            System.out.print("Enter the alphabet(A-F): ");
            alphabet = obj.scanner.next().toLowerCase().charAt(0);
        }
        // Using switch case to check city name according to the character given
        switch (alphabet) {
            case 'a' -> System.out.println("Amsterdam");
            case 'b' -> System.out.println("Barcelona");
            case 'c' -> System.out.println("Chicago");
            case 'd' -> System.out.println("Detroit");
            case 'e' -> System.out.println("Euston");
            case 'f' -> System.out.println("Florence");
        }
    }
}
