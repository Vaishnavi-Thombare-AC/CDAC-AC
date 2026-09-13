public class CopyArray {

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
        }

        int[] copiedArr = new int[size];

        for (int in = 0; in < size; in++) {
            copiedArr[in] = arr[in];
        }

        System.out.print("Original array: ");

        for (int in = 0; in < size; in++) {
            System.out.print(arr[in] + " ");
        }

        System.out.print("\nCopied array: ");

        for (int in = 0; in < size; in++) {
            System.out.print(copiedArr[in] + " ");
        }
    }
}