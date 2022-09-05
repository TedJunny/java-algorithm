package chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class UpSideDown {
    public ArrayList<String> solution(String[] inputs) {
        ArrayList<String> result = new ArrayList<>();

        for (String input : inputs) {
            char[] charArr = input.toCharArray();
            int lt = 0, rt = input.length() -1;

            while (lt < rt) {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }

            result.add(String.valueOf(charArr));
        }

        return result;
    }

//    public ArrayList<String> solution(String[] inputs) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : inputs) {
//            answer.add(new StringBuilder(x).reverse().toString());
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        UpSideDown T = new UpSideDown();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = sc.next();
        }

        for (String s : T.solution(words)) {
            System.out.println(s);
        }
    }
}
