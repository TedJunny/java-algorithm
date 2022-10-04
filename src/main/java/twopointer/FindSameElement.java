package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindSameElement {
    private ArrayList<Integer> solution(Integer[] arrayA, Integer[] arrayB) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(Arrays.asList(arrayA));
        Collections.sort(Arrays.asList(arrayB));

        int p1 = 0, p2 = 0;

        while (p1 < arrayA.length && p2 < arrayB.length) {
            if (arrayA[p1].equals(arrayB[p2])) {
                result.add(arrayA[p1++]);
                p2++;
            } else if (arrayA[p1] < arrayB[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthA = in.nextInt();
        Integer[] arrayA = new Integer[lengthA];

        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = in.nextInt();
        }

        int lengthB = in.nextInt();
        Integer[] arrayB = new Integer[lengthB];

        for (int i = 0; i < lengthB; i++) {
            arrayB[i] = in.nextInt();
        }

        for (Integer integer : new FindSameElement().solution(arrayA, arrayB)) {
            System.out.print(integer + " ");
        }
    }
}
