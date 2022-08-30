package chapter1;

import java.util.Scanner;

public class LongestWord {
    public String solution(String[] words) {
        String result = "";

        for (String word : words) {
            if (word.length() > result.length() ) {
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestWord T = new LongestWord();
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        System.out.println(T.solution(words));
    }
}
