package assaignment4;

public class SecondTimearray {
	static int a[]= {2,3,4,2,8,7};
	static int num = 2;

	int secondIndex(int[]arr,int num)
	{
		int firstIndex = -1;
		for(int i=0; i<arr.length; i++)e7
		{
			if(a[i]==num)
			{
				if(firstIndex == -1)
				{
					firstIndex =i;
				}else{return i;}
			}
			}
			return -1;
		}
	
public static void main(String[]args)
{
	SecondTimearray second = new SecondTimearray();
	int s = second.secondIndex(a, num);
	if(s!= -1)
	{
		System.out.println("Num value is accure index position of"+s);
	}
	else
	{
		System.out.println("Not Found");
	}


}}



	
	

