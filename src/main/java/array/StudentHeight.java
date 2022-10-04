package array;

import java.util.Scanner;

public class StudentHeight {
    private int solution(int num, int[] array) {
        int result = 0;
        int maxNum = 0;

        for (int i = 0; i < num; i++) {
            if (array[i] > maxNum) {
                result++;
                maxNum = array[i];
            }
        }

        return result;
    }


    public static void main(String[] args) {
        StudentHeight T = new StudentHeight();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] array = new int[input];

        for (int i = 0; i < input; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(T.solution(input, array));
    }
}
