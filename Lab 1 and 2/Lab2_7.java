import java.util.*;

public class Lab2_7 {
    public static void main(String[] args) {
        int n=50;
        System.out.println("Factors of" +n+"are:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+"");
            }
        }
    }
}
