import java.util.Scanner;
public class SumOfTwo
{
static int sumOfTwoNumbers(int m, int n)
{
return m + n;
}
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number ");
int m = sc.nextInt();
System.out.println("Enter the  number ");
int n = sc.nextInt();

int sum = sumOfTwoNumbers(m,n);
System.out.println("SUM of "+m +" and " +n+" is "+sum);
}
}
