package sorting;

public class InsertSorting {
	public static void main(String[]args) {
		   int arr[] = {3,41,18,11,39,22};
		   int n=arr.length;
		   int j;
		  
		   
		   
		
			for(int i=1; i<n; i++)
			   {
				   int current = arr[i];
				   j=i-1;
				   while (j >= 0 && arr[j] > current) {
		                arr[j + 1] = arr[j];
		                j--;
				   }
				   arr[j+1]=current;
			   }
			
		   		   for(int i:arr) {
			   System.out.println(i +" ");
		   }
		   System.out.println();
		   
	   }


}
