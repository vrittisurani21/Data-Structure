import java.util.*;

public class Lab2_6 {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
