import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int num;

        System.out.println("Enter the number of values: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value: ");
            num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
