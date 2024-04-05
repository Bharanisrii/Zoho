package assignment6;

public class ReverseString {
public static void main(String[]args)
{
	String str = "Environment";
	System.out.println("Before Reverse:"+str);
	String reverse ="";
	int l=str.length();
	for(int i=l; i>0; i--) {
	reverse = reverse+str.charAt(i-1);
	}
	System.out.println("After reverse:"+reverse);
	

	
}
}
