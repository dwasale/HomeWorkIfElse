import java.util.Scanner;

public class EmployeeIncome {

    public static void main(String[] args) {
        // Creating the class object and scanner object
        EmployeeIncome employeeIncome = new EmployeeIncome();
        Scanner scanner = new Scanner(System.in);

        // Getting user inputs
        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();

        System.out.print("Employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter employee basic salary: ");
        double employeeSalary = scanner.nextDouble();

        // Calculating the required fields for the employee gross salary
        double hra = employeeIncome.houseRentAllowance(employeeSalary);
        double da = employeeIncome.dearnessAllowance(employeeSalary);
        double ta = employeeIncome.travelAllowance(employeeSalary);
        double pf = employeeIncome.providentFund(employeeSalary);
        double grossSalary = employeeSalary + hra + da + ta - pf;

        // Getting the result and printing the Employee details on the console
        System.out.println("\n---------:Employee details:--------");
        System.out.println("EmployeeID: " + employeeID);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);

    }

    // Calculating HRA
    public double houseRentAllowance(double salary){
        return (salary/100) * 10;

    }
    // Calculating DA
    public double dearnessAllowance(double salary){
        return (salary/100) * 8;

    }
    // Calculating TA
    public double travelAllowance(double salary){
        return (salary/100) * 9;

    }
    // Calculating PF
    public double providentFund(double salary){
        return (salary/100) * 20;

    }
}
