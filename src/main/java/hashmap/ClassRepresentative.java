package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassRepresentative {
    public char solution(int number, String result) {
        HashMap<Character, Integer> elector = new HashMap<>();

        for (char c : result.toCharArray()) {
            elector.put(c, elector.getOrDefault(c, 0) + 1);
//            elector.put(c, elector.containsKey(c) ? elector.get(c) + 1 : 1);
//            elector.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }

        Integer max = Integer.MIN_VALUE;
        char representative = ' ';

        for (Character character : elector.keySet()) {
            if (elector.get(character) > max) {
                max = elector.get(character);
                representative = character;
            }
        }

        return representative;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = sc.next();

        System.out.println(new ClassRepresentative().solution(number, result));
    }
}
