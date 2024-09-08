import java.util.Arrays;

public class Lab20_2 {
    // Function to get the maximum value in the array
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // Function to perform counting sort based on the digit represented by exp
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to the current digit
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main function to implement Radix Sort
    static void radixSort(int arr[], int n) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr, n);

        // Do counting sort for every digit. Note that instead of passing the digit number, exp is passed. exp is 10^i where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // Utility function to print the array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {150, 55, 73, 90, 900, 34, 21, 66};
        int n = arr.length;
        System.out.println("Original array:");
        printArray(arr, n);

        radixSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}
