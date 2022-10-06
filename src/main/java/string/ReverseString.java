package string;

import java.util.Scanner;

public class ReverseString {
    public String solution(String inputString) {
        char[] charArray = inputString.toCharArray();
        int lt = 0, rt = charArray.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
                continue;
            }

            if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
                continue;
            }

            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;
            lt++;
            rt--;
        }


        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        System.out.println(new ReverseString().solution(input));
    }
}
