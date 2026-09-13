
public class SumArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " elements:");
        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
            sum += arr[in];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}