import java.io.*;
import java.util.Scanner;
public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted : ");
        int num = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println(num + " is not present");
            
        } else {
            System.out.println(num + " is present at position" + pos + " to be deleted");
                  

            for (int i = pos; i < n-1; i++) {
                arr[i] = arr[i + 1];
            }
  
            System.out.println("\nThe new array is : ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}