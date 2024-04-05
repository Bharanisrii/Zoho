package assignment6;
import java.util.Scanner;
public class CapitalizeFirstLetter {
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a Sentence");
String str = s.nextLine();
String upperCase = "";
Scanner sc = new Scanner(str);
while(sc.hasNext()) {
	String word = sc.next();
	upperCase+=Character.toUpperCase(word.charAt(0))+word.substring(1)+"";
}
System.out.println(upperCase.trim());
}

}
