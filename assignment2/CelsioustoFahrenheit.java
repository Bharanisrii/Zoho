package assignment2;
public class CelsioustoFahrenheit{
	public static void main(String[]args)
	{
		int x=1,i;
		out:
		for(i=0;i<10;i++)
		{
		   while(x++<50)
		     if(i*x==400)
			break out;
		}
		System.out.println(i + x);

	}
}