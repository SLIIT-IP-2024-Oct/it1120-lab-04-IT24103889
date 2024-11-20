import java.util.Scanner;

public class NumberType {
	public static void main(String[]args) {
 		
		// Create an object called input to the Scanner class
		Scanner input = new Scanner(System.in);

		// Take a number random number as the user input
		int num = input.nextInt();

		// Finding whether number is positive or negative
		if (num > 0) {
			System.out.println("The number is: Positive");
		} else (if num < 0) {
			System.out.println("The number is: Negative");
		} else {
			System.out.println("The number is: Zero");
		}
		
		input.close();
	}
}
