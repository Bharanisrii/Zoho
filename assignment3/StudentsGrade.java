package assignment3;
import java.util.Scanner;
public class StudentsGrade {
public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Five Subject Marks:");
 int m1 = scanner.nextInt();
 int m2 = scanner.nextInt();
 int m3 = scanner.nextInt();
 int m4 = scanner.nextInt();
 int m5 = scanner.nextInt();
 int total = m1+m2+m3+m4+m5;
 float per = total/5;
 System.out.println("Total:"+total);
 System.out.println("Percentage:"+per);
 if(per>90)
 {
	 System.out.println("Grade A");
 }
 else if(per>80)
 {
	 System.out.println("Grade B");
 }
 else if(per>70)
 {
	 System.out.println("Grade c");
 }
 else if(per>60)
 {
	 System.out.println("Grade d");
}
else if(per>50)
{
	System.out.println("Grade E");
}
else
{
	System.out.println("Grade F");
}
	
}
}
