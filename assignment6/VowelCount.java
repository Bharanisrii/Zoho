package assignment6;

public class VowelCount {
	public static void main(String[]args)
	{
		int count =0;
	
		String str = "Bharanisri";
		
		for(int i=0; i<str.length();i++) {
			
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			count++;
		}
		}
		
			System.out.println("Number of vowel in the String:"+count);
	}

}
