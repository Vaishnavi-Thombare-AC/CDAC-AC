
public class OddEven {
	public void findOdd()
	{
		System.out.println("Odd numbers");
		for(int tmp =1;tmp <=1000;tmp++)
		{
			if(tmp%2!=0)
				System.out.println(tmp);
		}
	}
	
	public void findEven()
	{
		System.out.println("Even numbers");
		for(int tmp =1;tmp <=500;tmp++)
		{
			if(tmp%2==0)
				System.out.println(tmp);
		}
	}

}
