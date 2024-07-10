import java.util.Scanner;
public class Lab4 _1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<arr.length-1;i++){
            System.out.println("Enter an element at index["+i+"]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to insert");
        int num = sc.nextInt();
        System.out.println("Enter index to insert the number");
        int index = sc.nextInt();

        for(int i=n;i>=index;i--){
            arr[i]=arr[i-1];
        }
        arr[index] = num;
        System.out.println("new array");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}