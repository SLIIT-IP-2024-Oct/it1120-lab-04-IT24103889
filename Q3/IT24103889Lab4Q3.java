import java.util.Scanner;

public class NumberTypeUsingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Using the ternary operator to check if the number is positive, negative, or zero
        String result = (num > 0) ? "The number is positive" :
                        (num < 0) ? "The number is negative" :
                        "The number is zero";

        // Display the result
        System.out.println(result);

        // Close the scanner
        input.close();
    }
}
