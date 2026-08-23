import java.util.Scanner;
class Numbers
{
    public static void main(String ar[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

    }
}