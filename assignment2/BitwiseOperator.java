package assignment2;
import java.util.Scanner;
public class BitwiseOperator {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = scanner.nextInt();
        int bitwiseAND = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAND);
        int bitwiseOR = num1 | num2;
        System.out.println("Bitwise OR: " + bitwiseOR);
        int bitwiseXOR = num1 ^ num2;
        System.out.println("Bitwise XOR: " + bitwiseXOR);
        int leftShift = num1 << num2;
        System.out.println("Left Shift: " + leftShift);
        int rightShift = num1 >> num2;
        System.out.println("Right Shift: " + rightShift);
scanner.close();
	}

}
