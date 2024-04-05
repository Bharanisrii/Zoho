package assignment12;

import java.util.Scanner;

public class InsufficientException extends Throwable {
	public InsufficientException(String message) {
		super(message);
	}

	public static void main(String[] args) throws InsufficientException {
		Scanner sc = new Scanner(System.in);
		int amount = 500;
		System.out.println("Enter your withdraw amount:");
		int a = sc.nextInt();
		try {

			if (amount > a) {
				System.out.println("Withdraw succesful");
			} else {
				throw new InsufficientException("Insufficient balance to withdraw");
			}
		} catch (InsufficientException c) {
			System.out.println(c.getMessage());
		}
	}

}
