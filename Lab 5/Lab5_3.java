import java.util.Arrays;
import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of words:");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int randomIndex = (int) (Math.random() * n);
        String originalWord = words[randomIndex];

        System.out.println("Enter an anagram of the word: " + originalWord);
        String userAnagram = sc.next();

        if (isAnagram(originalWord, userAnagram)) {
            System.out.println("valid anagram.");
        } else {
            System.out.println("not an anagram.");
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length()!= word2.length()) {
            return false;
        }

        char[] charArray1 = word1.toLowerCase().toCharArray();
        char[] charArray2 = word2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}