package assignment12;

public class sample1 {
	public static void main(String[] args) {
		int []a= new int[2];
		 a[0]=1;
		 a[1]=2;
		 try {
		 System.out.println(a[3]);
	}
		 catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index position of array"); 
		 }
	}

}
