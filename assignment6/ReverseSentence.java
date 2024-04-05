package assignment6;

public class ReverseSentence {
	public static void main(String[]args) {
		String str = "I am Happy";
		System.out.println("Enter Sentence:"+str);
		String reverse = "";
		for(int i=str.length()-1;i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reverse Sentence:"+reverse);
	}

}
