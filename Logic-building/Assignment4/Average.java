import java.util.Scanner;

public class Average 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float average = (float) sum / arr.length;
        System.out.println("The average of the numbers is: " + average);
    }
}