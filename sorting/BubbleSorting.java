package sorting;

public class BubbleSorting {
	public static void main(String[]args) {
		   int arr[] = {3,41,18,11,39,22};
		   boolean swapped;
		   int swapCounter=0;
		   int n=arr.length;
		  
		   
		   
		do {
			   swapped = false;
			   
			for(int i=1; i<n; i++)
			   {
				   if(arr[i-1]>arr[i]) {
					  int temp = arr[i-1];
					  arr[i-1]=arr[i];
					  arr[i]=temp;
					  swapped=true;
					  swapCounter++;
				   }
			   }
			   n--;
		   }while(swapped);
		   System.out.println("Number Of Swaps:"+swapCounter);
		   System.out.println("Sorted Array");
		   for(int i:arr) {
			   System.out.println(i +" ");
		   }
		   System.out.println();
		   
	   }

}
