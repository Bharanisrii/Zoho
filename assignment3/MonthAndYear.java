package assignment3;
import java.util.Scanner;
public class MonthAndYear {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month(1-12)");
		int month = scanner.nextInt();
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		boolean leapyear = year%4==0;
        switch(month)
		{
		case  1,3,5,7,8,10,12:
		System.out.println("Number of days 31");
		break;
		case 4,6,9,11:
		System.out.println("Number of days 30");
		break;
		case  2:
		if( leapyear)
		{
			System.out.println("Number of days 29");
		}
		else
		{
			System.out.println("Number of days 28");
		}
		}
	}

}
