package string;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistance {
    private ArrayList<Integer> solution(String str1, String str2) {
        ArrayList<Integer> results = new ArrayList<>();
        int firstIdx = str1.indexOf(str2);
        int nextIdx = str1.indexOf(str2, firstIdx + 1);

        int currentIdx = 0;
        for (char c : str1.toCharArray()) {
            if (currentIdx > nextIdx && str1.indexOf(str2, firstIdx + 1) != -1) {
                firstIdx = nextIdx;
                nextIdx = str1.indexOf(str2, firstIdx + 1);
            }

            int diffFirst = firstIdx - currentIdx;
            int diffNext = nextIdx - currentIdx;

            results.add(Math.min(Math.abs(diffFirst), Math.abs(diffNext)));
            currentIdx++;
        }

        return results;
    }

    private int[] solution(String str, char str2) {
        int[] answer = new int[str.length()];
        int dist = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2) {
                dist = 0;
            } else {
                dist++;
            }
            answer[i] = dist;
        }

        dist = 1000;

        for (int i = str.length() -1; i > -1; i--) {
            if (str.charAt(i) == str2) {
                dist = 0;
            } else {
                dist++;
            }
            answer[i] = Math.min(answer[i], dist);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char str2 = sc.next().charAt(0);

        for (int i : new MinimumDistance().solution(str1, str2)) {
            System.out.print(i + " ");
        }
    }
}
