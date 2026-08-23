class EvenNumber
{
	static void printEvenNumbers()
	{
		int n =1;
		while(n != 51)
		{
			if (n % 2 == 0)
			{								System.out.print(n + " ");
			}
			n++;
		}
	}
	public static void main(String ar[])
	{ EvenNumber.printEvenNumbers(); }

}