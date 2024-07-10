import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Ans=1;
        for(int i=1;i<=n;i++){
            Ans=Ans*i;
        }
        System.out.println("Answer:"+Ans);
    }
}
