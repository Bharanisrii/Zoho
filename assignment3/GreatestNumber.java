package assignment3;
import java.util.Scanner;
public class GreatestNumber {
public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Number 1:");
int num1 = scanner.nextInt();
System.out.println("Enter Number 2:");
int num2 = scanner.nextInt();
System.out.println("Enter Number 3:");
int num3 = scanner.nextInt();
if(num1>num2 && num1>num3)
{
	System.out.println("Greatest Number is 1");
}
else if(num2>num3 && num2>num1)
{
	System.out.println("Greatest Number is 2");
}
else if (num1==num2 && num2==num3 && num3==num1)
{
	System.out.println("Numbers are equal");
}
else
{
	System.out.println("Greatest Number is 3");
}
}
}
