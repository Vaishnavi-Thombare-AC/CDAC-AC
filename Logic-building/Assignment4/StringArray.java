import java.util.Scanner;

class StringArray
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[4];

        System.out.print("Enter 4 names:");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextLine();
        }
        System.out.println();
        for (String names : arr)
        {
            System.out.println(names);
        }

    }
}