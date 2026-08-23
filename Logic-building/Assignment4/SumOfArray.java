import java.util.Scanner;
class SumOfArray
{
    public static void main(String ar[])
    {
        Scanner sc =  new Scanner(System.in);
        int arr[]=new int[5];
        int sum = 0;
        System.out.print("Enter 5 integers:");
        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        } 
        for(int num : arr)
        {
            sum = sum + num;
        }
        System.out.println("The sum of all numbers is: "+sum);

    }
}