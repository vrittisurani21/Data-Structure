import java.util.Scanner;
import java.util.Stack;

public class Lab7_4 {

    // Method to check if the given string is balanced
    public static int isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < T; i++) {
            System.out.print("Enter string: ");
            String str = scanner.nextLine();
            System.out.println(isBalanced(str));
        }

        scanner.close();
    }
}
