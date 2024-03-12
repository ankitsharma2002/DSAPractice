package basiclogic;
// To check that given number is even or odd.

import java.util.Scanner;

public class OddEven {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Enter the number : ");
			double num1=scan.nextDouble();
			if(num1==0) {
				System.out.println("Number is even");
			}
			if(num1<1) {
				System.out.println("Please enter number grater than 1.");
			}
			if(num1%2==0) {
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is odd.");
			}
			System.out.println("Would you like to continue (Y||y) : ");
			choice=scan.next().charAt(0);
		}while(choice=='Y' || choice=='y');
		scan.close();
	}
}
