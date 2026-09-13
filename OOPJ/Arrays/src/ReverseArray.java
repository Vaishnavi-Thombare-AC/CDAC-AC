public class ReverseArray {

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
        }

        System.out.print("Reversed array: ");

        for (int in = size - 1; in >= 0; in--) {
            System.out.print(arr[in] + " ");
        }
    }
}