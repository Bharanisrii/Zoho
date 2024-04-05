package assignment2;
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[]args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Value a:");
	double a= scanner.nextDouble();
	System.out.println("Enter Value b:");
	double b = scanner.nextDouble();
	System.out.println("Enter Value c:");
	double c = scanner.nextDouble();
	double discriminant = b * b - 4 * a * c;
	if (discriminant > 0) {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    } else if (discriminant == 0) {
        double root = -b / (2 * a);
        System.out.println("Double Root: " + root);
    } else {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
        System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
        System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
    }
	}

}
