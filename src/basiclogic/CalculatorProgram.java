package basiclogic;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice in numbers : ");
            int option = scanner.nextInt();
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            switch (option) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = scanner.next().charAt(0);  
        } while (choice == 'Y' || choice == 'y');
        
        scanner.close();
    }
}

