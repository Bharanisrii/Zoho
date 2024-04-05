package assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
public static void main(String[]args) {
	try {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Your PhoneNumber");
	long phoneNumber = scanner.nextLong();
	System.out.println("PhoneNumber:"+phoneNumber);
	}
	catch(InputMismatchException e) {
        System.out.println("Error: Invalid input. Please enter a valid phone number.");

	}
}
}
