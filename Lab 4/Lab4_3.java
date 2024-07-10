import java.util.Scanner;

public class Lab4_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter the number to insert: ");
    int numToInsert = sc.nextInt();
    int indexToInsert = 0;
    while (indexToInsert < size && arr[indexToInsert] < numToInsert) {
      indexToInsert++;
    }
    int[] newArr = new int[size + 1];

    for (int i = 0; i < indexToInsert; i++) {
      newArr[i] = arr[i];
    }

    newArr[indexToInsert] = numToInsert;
    for (int i = indexToInsert; i < size; i++) {
      newArr[i + 1] = arr[i];
    }

    System.out.println("The new array is:");
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + " ");
    }
  }
}