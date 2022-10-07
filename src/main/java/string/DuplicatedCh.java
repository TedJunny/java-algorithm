package string;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatedCh {
    public String solution(String input) {
        char[] chars = input.toCharArray();
        List<Character> answer = new ArrayList<>();

        for (char aChar : chars) {
            if (!answer.contains(aChar)) {
                answer.add(aChar);
            }
        }

        return answer.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public String solution2(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer += input.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        System.out.println(new DuplicatedCh().solution(input));
    }
}
