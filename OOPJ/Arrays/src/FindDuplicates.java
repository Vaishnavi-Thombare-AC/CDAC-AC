public class FindDuplicates {

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
        }

        System.out.println("Duplicate values:");

        boolean found = false;

        for (int in = 0; in < size; in++) {

            for (int j = in + 1; j < size; j++) {

                if (arr[in] == arr[j]) {
                    System.out.println(arr[in]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}