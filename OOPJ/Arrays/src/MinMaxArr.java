public class MinMaxArr {

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();

        if (size <= 0)
            return;

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int in = 1; in < size; in++) {

            if (arr[in] > max)
                max = arr[in];

            if (arr[in] < min)
                min = arr[in];
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}