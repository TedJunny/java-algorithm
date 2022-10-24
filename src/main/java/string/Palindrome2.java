package string;

import java.util.Scanner;

public class Palindrome2 {
    public String solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseStr = new StringBuffer(input).reverse().toString();

        return input.equals(reverseStr) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        System.out.println(new Palindrome2().solution(str));
    }
}
