package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class WrestlePlayer {
    public int solution(int[][] players) {
        Arrays.sort(players, (p1, p2) -> p2[0] - p1[0]);
        int result = 0;
        int maxBw = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i][1] > maxBw) {
                maxBw = players[i][1];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] players = new int[num][2];

        for (int i = 0; i < num; i++) {
            players[i][0] = sc.nextInt();
            players[i][1] = sc.nextInt();
        }

        System.out.println(new WrestlePlayer().solution(players));
    }
}
