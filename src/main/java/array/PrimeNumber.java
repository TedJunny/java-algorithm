package array;

import java.util.Scanner;

public class PrimeNumber {
    public int solution(int number) {
        int[] numbers = new int[number + 1];
        int answer = 0;

        for (int i = 2; i <= number; i++) {
            if (numbers[i] == 0) {
                answer++;
            }

            if (numbers[i] == 1) {
                continue;
            }

            for (int j = i; j <= number; j += i) {
                numbers[j] = 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.println(new PrimeNumber().solution(number));
    }
}
