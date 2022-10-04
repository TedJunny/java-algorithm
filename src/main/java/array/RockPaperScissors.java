package array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
    private ArrayList<String> solution(int[] arrayA, int[] arrayB) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == arrayB[i]) {
                answer.add("D");
                continue;
            }

            if (Math.abs(arrayA[i] - arrayB[i]) == 1) {
                if (arrayA[i] > arrayB[i]) {
                    answer.add("A");
                } else {
                    answer.add("B");
                }
                continue;
            }

            if (Math.abs(arrayA[i] - arrayB[i]) == 2) {
                if (arrayA[i] < arrayB[i]) {
                    answer.add("A");
                } else {
                    answer.add("B");
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors T = new RockPaperScissors();
        Scanner in = new Scanner(System.in);
        int gameNum = in.nextInt();
        int[] arrayA = new int[gameNum];
        int[] arrayB = new int[gameNum];

        for (int i = 0; i < gameNum; i++) {
            arrayA[i] = in.nextInt();
        }

        for (int i = 0; i < gameNum; i++) {
            arrayB[i] = in.nextInt();
        }

        for (String s : T.solution(arrayA, arrayB)) {
            System.out.println(s);
        }
    }
}
