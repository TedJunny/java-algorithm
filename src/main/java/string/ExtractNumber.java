package string;

import java.util.Scanner;

public class ExtractNumber {
    public int solution(String input) {
        String replacedStr = input.replaceAll("[^0-9]", "");

        return Integer.parseInt(replacedStr);
    }

    public int solution2(String input) {
        String answer = "";
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    public int solution3(String input) {
        int answer = 0;
        for (char c : input.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        System.out.println(new ExtractNumber().solution3(input));
    }
}
