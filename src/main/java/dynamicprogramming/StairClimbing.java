package dynamicprogramming;

import java.util.Scanner;

public class StairClimbing {
    public int solution(int num) {
        int[] result = new int[num];
        result[0] = 1;
        result[1] = 2;

        for (int i = 2; i < num; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        return result[num - 1];
    }

    public static void main(String[] args) {
        int stairNum = new Scanner(System.in).nextInt();

        System.out.println(new StairClimbing().solution(stairNum));
    }
}
