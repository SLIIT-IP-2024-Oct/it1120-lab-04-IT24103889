import java.util.Scanner;

public class FinalMarkCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks and validate
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid input! Exam marks must be between 0 and 100. Please enter again: ");
            examMarks = input.nextDouble();
        }

        // Input lab submission marks and validate
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid input! Lab submission marks must be between 0 and 100. Please enter again: ");
            labMarks = input.nextDouble();
        }

        // Input percentages and validate they sum up to 100
        System.out.print("Enter the percentage for exam marks (out of 100): ");
        double examPercentage = input.nextDouble();
        
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid input! Exam percentage must be between 0 and 100. Please enter again: ");
            examPercentage = input.nextDouble();
        }

        System.out.print("Please enter percentage for lab submission marks (out of 100): ");
        double labPercentage = input.nextDouble();
        
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid input! Lab percentage must be between 0 and 100. Please enter again: ");
            labPercentage = input.nextDouble();
        }

        // Validate that the percentages sum up to 100
        while (examPercentage + labPercentage != 100) {
            System.out.print("The percentages must sum up to 100! Please re-enter the percentages.\n");

            System.out.print("Please enetr percentage for exam marks (out of 100): ");
            examPercentage = input.nextDouble();

            System.out.print("Please enter percentage for lab submission marks (out of 100): ");
            labPercentage = input.nextDouble();
        }

        // Calculate final marks
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Display the final mark
        System.out.println("The final mark based on the weighted percentages is: " + finalMarks);

        // Close the scanner
        input.close();
    }
}
