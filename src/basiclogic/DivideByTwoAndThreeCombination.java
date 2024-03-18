package basiclogic;

import java.util.Scanner;

public class DivideByTwoAndThreeCombination {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		char choice;
		do {
			double num1 = scan.nextDouble();
			double num2 = scan.nextDouble();
			if (num1 <= 1 && num2 <= 1) {
				System.out.println("Please enter the correct number");
			}
			if (num1 % 2 == 0 && num2 % 3 == 0) {
				System.out.println("Number is divided by 2 and 3.");
			}
			if (num1 % 2 == 0) {
				System.out.println("Number is divided by 2.");
			}
			if (num2 % 3 == 0) {
				System.out.println("Number is divided by 3.");
			}
			System.out.println("Would you like to continue (Y||y) : ");
			choice = scan.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		scan.close();
	}
}
