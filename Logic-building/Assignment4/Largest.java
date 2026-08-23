import java.util.Scanner;
import java.util.Arrays;

public class Largest 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("The largest element is: " + arr[arr.length - 1]);

    }
}