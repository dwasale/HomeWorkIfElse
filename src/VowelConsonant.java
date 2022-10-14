import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        char character = scanner.next().charAt(0);

        // Checking if the given character is vowels
        if (character == 'a' || character == 'e' ||character == 'i' || character == 'o' || character == 'u'){ // If it is true
            System.out.println("Input letter is Vowels"); //This code will execute
        } else {  // Or if the above condition is false it will execute
            System.out.println("Input letter is Consonant");
        }
    }
}
