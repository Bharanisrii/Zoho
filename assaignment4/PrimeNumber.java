package assaignment4;

public class PrimeNumber{
	public static void main(String[]args)
	{
		int num=30;
		System.out.println("Prime Number Less than or equzal to"+num+"are");
		for(int i=2; i<=num; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
	}	
	
	
	public static boolean isPrime(int num) {
	
	if(num<=1) {
		return false;
	}
				if(num==2 || num ==3)
				{
					return true;
				}
					if(num%2==0 || num%3==0) {
						return false;
					}
						for(int i=5; i*i<=num; i+=6)
						{
							if(num % i==0 || num % (i+2)==0)
							{
							return false;	
							}
						}			
			
return true;
	}
	
	
}