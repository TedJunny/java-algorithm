package chapter1;

import java.util.Scanner;

public class FindCharacter {
    public int solution(String str, char c) {
        int result = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char ch : str.toCharArray()) {
            if (ch == c) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindCharacter findCharacter = new FindCharacter();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char finder = sc.next().charAt(0);
        System.out.println(findCharacter.solution(input, finder));
    }
}
