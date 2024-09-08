public class Lab22_2 {
    // Function to sort array using ShellSort
    void sort(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                // Add arr[i] to the elements that have been gap sorted
                // Save arr[i] in temp and make a hole at position i
                int temp = arr[i];
                int j;
                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                // Put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    // Utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting:");
        printArray(arr);

        Lab22_2 ob = new Lab22_2();
        ob.sort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);
    }
}
