public class UpperToLowercase {

    public static void main(String[] args) {

        char alphabet = 'Z';
        System.out.println("Given alphabet is " + "'" + alphabet + "'");
        // Checking the alphabet is in lowercase
        if (alphabet == Character.toLowerCase(alphabet)){
            System.out.println("Given alphabet is in lowercase");
        } else {    // If the alphabet is in Uppercase below statement will execute
            System.out.println("Given alphabet in lowercase is " + "'" + Character.toLowerCase(alphabet) + "'");
        }
    }
}
