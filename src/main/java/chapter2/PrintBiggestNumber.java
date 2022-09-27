package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBiggestNumber {
    public ArrayList<Integer> solution(int input, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(array[0]);

        for (int i = 1; i < input; i++) {
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        PrintBiggestNumber T = new PrintBiggestNumber();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] array = new int[input];

        for (int i = 0; i < input; i++) {
            array[i] = in.nextInt();
        }

        for (int i : T.solution(input, array)) {
            System.out.print("i = " + i);
        }
    }
}
