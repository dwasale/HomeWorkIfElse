import java.util.Scanner;
// Question number 4 is included in this program
public class MarkSheet {
    // Creating scanner object and initialising marks variables for each subjects
    Scanner scanner  = new Scanner(System.in);

    int mathMarks = 0;
    int scienceMarks = 0;
    int englishMarks = 0;

    public static void main(String[] args) {
        MarkSheet obj = new MarkSheet();  //Object created to access non-static methods/variables in static method

        // Getting user input values
        System.out.print("Enter student name: ");
        String name = obj.scanner.nextLine();       // Storing the user input values as String. nextLine() reads input including space

        System.out.print("Enter roll number: ");
        int rollNumber = obj.scanner.nextInt();     // Storing the user input Integer value only

        System.out.print("Enter marks in Maths: ");
        obj.mathMarks = obj.scanner.nextInt();

        System.out.print("Enter marks in English: ");
        obj.englishMarks = obj.scanner.nextInt();

        System.out.print("Enter marks in Science: ");
        obj.scienceMarks = obj.scanner.nextInt();

        // Calculating total and percentage from the given values
        int total = obj.total();
        double percentage = obj.percentage(obj.total());

        System.out.println("-----------------Student MarkSheet----------------" );
        System.out.println("Name: " + name);
        System.out.println("RollNumber: " + rollNumber);
        System.out.println("Maths: " + obj.mathMarks);
        System.out.println("Science: " + obj.scienceMarks);
        System.out.println("English: " + obj.englishMarks);

        System.out.println("Total: " + total);
        System.out.println(("Percentage: ") + String.format("%.2f",percentage));

        // Checking for the condition to be true/false and execute the respective output
        // It will only print the Grade if the student is pass
        if (obj.mathMarks < 35 || obj.scienceMarks < 35 || obj.englishMarks < 35){
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
            if (percentage >= 80 ){
                System.out.println("Grade A+");
            } else if (percentage >= 60){
                System.out.println("Grade A");
            } else if (percentage >= 50){
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }

        }
    }

    // method for calculating total student marks in 3 subjects
    public int total(){
        return mathMarks + englishMarks + scienceMarks;
    }

    // method to calculate percentage
    public double percentage(int total){
        return (double) total/3;
    }
}
