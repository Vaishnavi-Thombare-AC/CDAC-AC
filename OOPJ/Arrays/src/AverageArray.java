
public class AverageArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = ConsoleInput.getInt();
        int[] arr = new int[size];
        double sum = 0;

        System.out.println("Enter " + size + " elements:");
        for (int in = 0; in < size; in++) {
            arr[in] = ConsoleInput.getInt();
            sum += arr[in];
        }

        double average;
        if(size >0)
        	 average =sum / size;
        else
        	 average =0;
        
        System.out.println("Average value: " + average);
    }
}