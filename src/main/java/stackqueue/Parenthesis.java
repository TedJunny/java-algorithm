package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public String solution(String input) {
        if (input.length() % 2 == 1) {
            return "NO";
        }


        int opnerCount = 0, closerCount = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                opnerCount++;
            } else {
                closerCount++;
            }

            if (closerCount > opnerCount) {
                return "NO";
            }
        }

        return opnerCount == closerCount ? "YES" : "NO";
    }

    public String solution2(String input) {
        Stack<Character> stack = new Stack<>();

        for (Character c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                continue;
            }

            if (stack.empty()) {
                return "NO";
            }

            stack.pop();
        }

        return stack.empty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        System.out.println(new Parenthesis().solution2(input));
    }
}
