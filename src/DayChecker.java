import java.util.Scanner;

public class DayChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day in a week 1-7: ");
        int day = scanner.nextInt();

        // Checking if the given value is in range
        while (day <1 || day >7){
            System.out.println("Enter valid day");
            System.out.print("Enter a day in a week 1-7: ");
            day = scanner.nextInt();
        }
        // Checking each case with corresponding value
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
