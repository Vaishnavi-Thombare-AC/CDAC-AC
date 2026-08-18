public class Large 
{
public static void main(String ar[])
{
	int a = 10;
	int b = 20;
	int c = 50;
	if (a>b)
	{
		if (a>c)
		{
			System.out.println("largest is " + a);
		}
		else
		{
			System.out.println("largest is " + c);
		}
	}
	else if(b>c)
	{
		System.out.println("Largest is " + b);
	}
	else 
	{
		System.out.println("Largest is " + c);
	}
}
}
