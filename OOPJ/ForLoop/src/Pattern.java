
public class Pattern {
	
public void printPattern()
{
	for(int outer = 1;outer <=5;outer++)
	{
		for(int inner = 1;inner<=outer;inner++ )
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("\n\n\n");
	
	for(int outer = 1;outer <=5;outer++)
	{
		for(int inner = 5;inner>=outer;inner-- )
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	for(int outer = 1;outer <=6;outer++)
	{
		for(int inner = 1;inner<=outer;inner++ )
		{
			System.out.print(inner);
		}
		System.out.println();
	}
	
System.out.println("\n\n\n");
	
	for(int outer = 6;outer >=1;outer--)
	{
		for(int inner = 1;inner<=outer;inner++ )
		{
			System.out.print(inner);
		}
		System.out.println();
	}
	
	System.out.println("\n\n\n");
	 int number = 1; 
     for (int outer = 1; outer <= 4; outer++) 
     {
         for (int inner = 1; inner <= outer; inner++) 
         {
             System.out.print(number + " ");
             number++; 
         }
         System.out.println(); 
     }
	System.out.println("\n\n\n");
	
	
}

}
