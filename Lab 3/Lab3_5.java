import java.util.*;

public class Lab3_5 {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        printDuplicates(arr);
    }

    static void printDuplicates(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates present in the array.");
        }
    }
}
