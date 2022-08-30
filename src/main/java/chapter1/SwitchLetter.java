package chapter1;

import java.util.Scanner;

public class SwitchLetter {
    public String solution(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }


            /*
             * ASCII 코드를 이용한 솔루션
             * A ~ Z : 65 ~ 90
             * a ~ z : 97 ~ 122
             * 32 차이가 난다
             * */

            /*if (c >= 65 && c <= 90) {
                result += (char) (c + 32);
            } else {
                result += (char) (c - 32);
            }*/

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();

        SwitchLetter switchLetter = new SwitchLetter();
        System.out.println(switchLetter.solution(inputString));
    }
}
