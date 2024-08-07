import java.util.Scanner;


class Number {
    int a;
    int b;
    Number (int a,int b){
        this.a=a;
        this.b=b;
    }
    public void SwapNumbers(){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"b="+b);
    }
}


public class SwapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        Number n = new Number (a,b);
        n.SwapNumbers();
    }
}
