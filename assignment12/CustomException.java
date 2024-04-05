package assignment12;

import java.util.Scanner;

public class CustomException extends Throwable {
	public CustomException(String message) {
	super(message);	
	}
	public static void main(String[]args) throws CustomException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Value");
		int value = scanner.nextInt();
		try {
		if(value<=18) {
			throw new CustomException("Value is less than or equal to 18");
		}
		else {
			System.out.println("Value is greater 18");
		}
	}
		catch(CustomException c )
		{
			System.out.println(c.getMessage());
		}		
		}

}
