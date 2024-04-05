package assaignment4;

public class EvenNumbers {
public static void main(String[]args)
{
	int a[] = {2,3,1,8,6,5,8,4};
	 int sum=0;
	for(int num:a)
	{
		if(num%2==0)
		{
			sum=sum+num;
		}
		continue;
	}
	System.out.println(sum);
}
}
