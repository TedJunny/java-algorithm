package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int number : numbers) {
            int reversedNum = 0;
            boolean isPrimeNum = true;

            while (number != 0) {
                reversedNum = reversedNum * 10 + number % 10;
                number /= 10;
            }

            if (reversedNum < 2) {
                continue;
            }

            if (reversedNum == 2) {
                answer.add(reversedNum);
                continue;
            }

            for (int i = 3; i < reversedNum; i++) {
                if (reversedNum % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }

            if (isPrimeNum) {
                answer.add(reversedNum);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i : new ReversePrimeNumber().solution(numbers)) {
            System.out.print(i + " ");
        }
    }
}
