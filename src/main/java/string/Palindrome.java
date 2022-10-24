package string;

import java.util.Scanner;

public class Palindrome {
    public String solution(String input) {
        String reverseStr = new StringBuffer(input).reverse().toString();

        return input.equalsIgnoreCase(reverseStr) ? "YES" : "NO";
    }

    public String solution2(String input) {
        String lowerStr = input.toLowerCase();
        for (int i = 0; i < lowerStr.length() / 2; i++) {
            if (lowerStr.charAt(i) != lowerStr.charAt(lowerStr.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        System.out.println(new Palindrome().solution(str));
    }
}
