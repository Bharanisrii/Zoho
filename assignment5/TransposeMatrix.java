package assignment5;

public class TransposeMatrix {
public static void main(String[]args)
{
	int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
	int b[][]=new int[3][3];
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.print(a[i][j]+"");
		}
		System.out.println();
	}
	System.out.println("Transpose Matrix");
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			b[i][j]=0;
			for(int k=0; k<3; k++) {
				b[i][j]=a[j][i];
			}
			System.out.print(b[i][j]+"");
		}
		System.out.println();
	}
}
}
