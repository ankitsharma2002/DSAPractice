package basiclogic;

import java.util.Scanner;

public class Sum {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please enter the value for a and b : ");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double sum= num1 + num2;
		System.out.print("Sum of "+num1+" and "+num2+" number is : "+sum);
		System.out.print("Sum of "+num1+" and "+num2+" number is : "+sum);
	}
}
