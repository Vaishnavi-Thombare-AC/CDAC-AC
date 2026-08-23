import java.util.Scanner;
class Positive
{
	static int askForPositiveNumber()
	{
	Scanner sc = new Scanner(System.in);
	int num;

	do
	{
		System.out.print("Enter a positive number: ");
		num = sc.nextInt();	
	}while(num<0);
return num;
	}

	public static void main(String ar[])
	{
		int positive = askForPositiveNumber();

		System.out.println("You entered a positive number:"+positive);
	}
}