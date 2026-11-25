
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("================================");
        System.out.println("       JAVA CALCULATOR");
        System.out.println("================================");

        while (running) {

            System.out.println("\nSelect an Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for using Java Calculator!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (choice) {

                case 1:
                    result = num1 + num2;
                    break;

                case 2:
                    result = num1 - num2;
                    break;

                case 3:
                    result = num1 * num2;
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    result = num1 / num2;
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot calculate modulus by zero!");
                        continue;
                    }
                    result = num1 % num2;
                    break;
            }

            System.out.println("-------------------------------");
            System.out.println("Result: " + result);
            System.out.println("-------------------------------");
        }

        input.close();
    }
}
