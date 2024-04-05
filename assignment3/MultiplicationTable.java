package assignment3;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scanner.nextInt();
		int number,multiplication;
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

}
