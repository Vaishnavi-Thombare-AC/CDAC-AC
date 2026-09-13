public class CommonElements {

    public static void main(String[] args) {

        System.out.print("Enter size of first array: ");
        int size1 = ConsoleInput.getInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter elements of first array:");

        for (int in = 0; in < size1; in++) {
            arr1[in] = ConsoleInput.getInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = ConsoleInput.getInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter elements of second array:");

        for (int in = 0; in < size2; in++) {
            arr2[in] = ConsoleInput.getInt();
        }

        System.out.println("Common elements:");

        for (int in = 0; in < size1; in++) {

            for (int j = 0; j < size2; j++) {

                if (arr1[in] == arr2[j]) {
                    System.out.println(arr1[in]);
                    break;
                }
            }
        }
    }
}