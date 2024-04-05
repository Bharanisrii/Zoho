package assignment2;
import java.util.Scanner;
public class BMI_Calculator {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Weight in Kilograms:");
		float w = scanner.nextFloat();
		System.out.println("Enter Height in meters:");
		float h = scanner.nextInt();
		double m=h/100;
		
		double bmi=w/(m*m);
		
		System.out.println(bmi);
		
		
		
	}

}
