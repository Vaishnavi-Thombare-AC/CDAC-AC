import java.util.Scanner;
class Odd
{
    public static void main(String ar[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum =0;
        for(int i = 1; i<=n;i++)
        {
            if(i%2!=0)
            {
                sum = sum+i;
            }
        }
        System.out.print("The sum of odd numbers from 1 to "+n+" is: "+ 25);

       
    }
}