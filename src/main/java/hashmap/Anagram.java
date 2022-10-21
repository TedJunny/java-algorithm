package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public String solution(String strA, String strB) {
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < strA.length(); i++) {
            mapA.put(strA.charAt(i), mapA.getOrDefault(strA.charAt(i), 0) + 1);
            mapB.put(strB.charAt(i), mapB.getOrDefault(strB.charAt(i), 0) + 1);
        }

        return mapA.equals(mapB) ? "YES" : "NO";
    }

    public String solution2(String strA, String strB) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : strA.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : strB.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                answer = "NO";
                break;
            }

            map.put(c, map.get(c) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();

        System.out.println(new Anagram().solution(strA, strB));
    }
}
