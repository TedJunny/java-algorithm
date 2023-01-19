import java.util.*;

public class Solution {
    public int solution(int[] array) {
        int mode = 0;
        int maxCount = Integer.MIN_VALUE;
        int[] counter = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            counter[array[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                mode = array[i];
            }
        }
        int finalMaxCount = maxCount;
        int reps = (int) Arrays.stream(counter).boxed().filter(integer -> integer == finalMaxCount).count();
        return reps > 1 ? -1 : mode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1}));
    }
}
