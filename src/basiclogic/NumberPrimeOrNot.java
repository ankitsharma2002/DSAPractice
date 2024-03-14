package basiclogic;

import java.util.Scanner;

public class NumberPrimeOrNot {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		char choice;
		do {
			double num=scan.nextDouble();
			if(num<=1) {
				System.out.println("Not prime number.");
			}
			if(num==2) {
				System.out.println("Prime number.");
			}
			if(num%2==0) {
				System.out.println("Not Prime.");
			}
			for(int i=3;i<Math.sqrt(num);i+=2) {
				if(num%i==0) {
					System.out.println("Not Prime");
					break;
				}	
			}
			System.out.println("Would you like to continue (Y||y) : ");
			choice = scan.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		scan.close();
	}
}
