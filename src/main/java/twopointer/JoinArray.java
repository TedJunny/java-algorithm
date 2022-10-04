package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JoinArray {
    private ArrayList<Integer> solution(int[] arrayA, int[] arrayB) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < arrayA.length && p2 < arrayB.length) {
            if (arrayA[p1] < arrayB[p2]) {
                result.add(arrayA[p1++]);
            } else {
                result.add(arrayB[p2++]);
            }
        }

        while (p1 < arrayA.length) {
            result.add(arrayA[p1++]);
        }

        while (p2 < arrayB.length) {
            result.add(arrayB[p2++]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthA = in.nextInt();
        int[] arrayA = new int[lengthA];

        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = in.nextInt();
        }

        int lengthB = in.nextInt();
        int[] arrayB = new int[lengthB];

        for (int i = 0; i < lengthB; i++) {
            arrayB[i] = in.nextInt();
        }

        for (Integer integer : new JoinArray().solution(arrayA, arrayB)) {
            System.out.print(integer + " ");
        }
    }
}
