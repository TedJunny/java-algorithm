package dynamicprogramming;

import java.util.Scanner;

public class StoneBridge {
    public int solution(int num) {
        int[] result = new int[num + 1];
        result[1] = 2;
        result[2] = 3;

        for (int i = 3; i <= num; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[num];
    }

    public static void main(String[] args) {
        int stoneNum = new Scanner(System.in).nextInt();

        System.out.println(new StoneBridge().solution(stoneNum));
    }
}
