import java.util.Scanner;

public class FindingCommission {

    public static void main(String[] args) {
        // Creating scanner object
        Scanner scanner  = new Scanner(System.in);

        int salesCommission;

        System.out.print("Enter sales ID: ");
        // Getting values from users
        String salesID = scanner.nextLine();

        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        int salesAmount = scanner.nextInt();

        System.out.print("Enter basic salary: ");
        int basicSalary = scanner.nextInt();

        // Printing in console the way it is written
        System.out.println("-----------------------------------------------------");
        System.out.println("Sales ID: " + salesID);
        System.out.println("Seller's name: " + sellerName);
        System.out.println("Sales amount: " + salesAmount);
        System.out.println("Basic salary: " + basicSalary);

        // Calculating the commission percentage according to the sales amount
        if (salesAmount >= 50000){      // Checking the given condition and printing the statement
            salesCommission = (salesAmount / 100) * 35;
            System.out.println("Commission received by " + sellerName + " is " + salesCommission);
        } else if (salesAmount >= 30000){
            salesCommission = (salesAmount / 100) * 20;
            System.out.println("Commission received by " + sellerName + " is " + salesCommission);
        } else if (salesAmount >= 20000) {
            salesCommission = (salesAmount / 100) * 10;
            System.out.println("Commission received by " + sellerName + " is " + salesCommission);
        } else if (salesAmount >= 10000) {
            salesCommission = (salesAmount / 100) * 5;
            System.out.println("Commission received by " + sellerName + " is " + salesCommission);
        } else  {       // If all the above condition is false then the below statement is printed
            salesCommission = (salesAmount / 100) * 2;
            System.out.println("Commission received by " + sellerName + " is " + salesCommission);
        }
    }
}
