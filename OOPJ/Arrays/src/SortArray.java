public class SortArray {

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int inp = 0; inp < size; inp++) {
            arr[inp] = ConsoleInput.getInt();
        }

        for (int index = 0; index < size - 1; index++) {
            for (int index2 = index + 1; index2 < size; index2++) {

                if (arr[index] > arr[index2]) {
                    int temp = arr[index];
                    arr[index] = arr[index2];
                    arr[index2] = temp;
                }

            }
        }

        System.out.print("Sorted array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}