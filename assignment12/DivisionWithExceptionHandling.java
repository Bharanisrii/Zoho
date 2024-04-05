package assignment12;

import java.util.Scanner;

public class DivisionWithExceptionHandling {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int numerator=scanner.nextInt();
		System.out.println("Enter the Denominator");
		int denominator=scanner.nextInt();
		try {
			System.out.println(numerator/denominator);
		}
		catch (ArithmeticException e) {
	            System.out.println("Denominator is Zero");
	            }
		
	}

}
