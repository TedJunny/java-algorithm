package array;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumber {
    private ArrayList<Integer> solution(int length) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (i <= 1) {
                result.add(1);
                continue;
            }

            result.add(result.get(i -2)+ result.get(i -1));
        }

        return result;
    }

    public static void main(String[] args) {
        FibonacciNumber T = new FibonacciNumber();
        int length = new Scanner(System.in).nextInt();

        for (Integer number : T.solution(length)) {
            System.out.print(number + " ");
        }
    }
}
