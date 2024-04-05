package assignment5;
import java.util.Scanner;
public class RightRotate {
public static void main(String[]args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = scanner.nextInt();
	System.out.println("Enter the Number of array");
	int[]arr=new int[size];
	for(int i=0; i<size; i++)
		arr[i]=scanner.nextInt();
	System.out.println("Enter the rorate Count");
	int r=scanner.nextInt();
	for(int i=0; i<r;i++)
	{
		int last = arr[arr.length-1];
	
	for(int j=arr.length-1;j>0;j--)
	{
		arr[j]=arr[j-1];
			}
	arr[0]=last;

		System.out.println();
		}
	for(int i=0; i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
