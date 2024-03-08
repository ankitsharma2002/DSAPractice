package basiclogic;

import java.util.Scanner;

public class MaxThreeNumber {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please enter the value for three number one by one : ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is greater number in all three numbers.");
			}
		} else if (num2 > num3) {
			System.out.println(num2 + " is greater number in all three numbers.");
		} else {
			System.out.println(num3 + " is greater number in all three numbers.");
		}
	}
}
